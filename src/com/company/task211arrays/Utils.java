package com.company.task211arrays;

public class Utils {

    public static void printList(String[] products, int[] prices) {
        System.out.println("Список возможных товаров для покупки:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + ". " + products[i] + " (стоимость за единицу - " + prices[i] + ")");
        }
    }

    public static int[] getProductAndCount(String str) {
        try {
            int[] result = new int[2];
            String[] parseString = str.split(" ");
            result[0] = Integer.parseInt(parseString[0]) - 1;
            result[1] = Integer.parseInt(parseString[1]);
            return result;
        } catch (RuntimeException e){
             return new int[]{-1, -1};
        }
    }

    public static void printBasket(String[] products, int[] prices, int[] counts) {
        int summ = 0;
        System.out.println("Наименование товара --- Количество --- Цена/за.ед --- Общая стоимость");
        for (int i = 0; i < products.length; i++) {
            if (counts[i] != 0) {
                System.out.printf("%19s %14d %14d %19d\n", products[i], counts[i], prices[i], prices[i] * counts[i]);
                summ += prices[i] * counts[i];
            }
        }
        System.out.printf("%49s %19d", "Итого:", summ);

    }
}
