package com.company.task211;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingBasket {
    public static void main(String[] args) {

        final String header =   "Введите номер продукта и его количество (в формате Н К) для добавления в корзину. \n" +
                                "add - чтобы добавить товар в список. \n" +
                                "end - чтобы закончить покупки. " +
                                "list - чтобы увидеть список продуктов";
        File file = new File("products.csv");
        Map<Product, Integer> basket = new HashMap<>();


        System.out.println("Добро пожаловать в систему покупок.");
        System.out.println("Список возможных товаров для покупки:");
        Utils.printProducts(file);


        boolean nextIter = true;

        while (nextIter) {
            System.out.println(header);
            String answer = Utils.getAnswer();
            if (answer.equals("end")) {
                basket.forEach((k, v) -> System.out.println
                        (k.getName() + "                " +
                        v.toString() + "                " +
                        k.getPrice() + "                " +
                        v * k.getPrice()
                ));
                int summ = basket.entrySet().stream()
                        .map(p -> p.getKey().getPrice() * p.getValue())
                        .reduce((a, b) -> a + b)
                        .get();

                System.out.printf("Общая сумма покупок : " + summ / 100 + " рублей и " + summ % 100 + " копеек");
                break;
            } else if (answer.equals("list")){
                Utils.printProducts(file);
            } else if (answer.equals("add")) {
                Utils.addProductToFile(file);
            } else {
                int productId = Utils.getProductId(answer);
                int productQuantity = Utils.getQuantity(answer);

                basket.put(Utils.getListFromFile(file).get(productId), productQuantity);
            }
        }
    }
}
