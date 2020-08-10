package com.company.task211arrays;

import java.util.Scanner;

public class Main {
    public static final int NAN_ERROR = -1;

    public static void main(String[] args) {

        String[] products = new String[]{"Хлеб", "Яблоки", "Молоко", "Сыр"};
        int[] prices = new int[]{100, 200, 300, 400};
        int[] counts = new int[prices.length];

        Utils.printList(products, prices);
        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите товар и количество для добавления в корзину.");
            System.out.println("Введите `end` для подсчета или 'list' для вывода списка продуктов.");
            String str = scanner.nextLine();
            if (str.equals("end")) {
                System.out.println("Завершение программы.");
                break;
            } else if (str.equals("list")) {
                Utils.printList(products, prices);
                continue;
            }

            int[] getInput = Utils.getProductAndCount(str); //получаем массив из двух целых чисел ввода - правильный индекс продукта в массиве и его количество
            int productIndex = getInput[0];
            int productCount = getInput[1];


            if (productIndex == NAN_ERROR && productCount == NAN_ERROR) {
                System.out.println("Вы ввели не целочисленные значения.");
                continue;
            }
            if ((productIndex < 0) || (productIndex >= products.length) || (productCount < 1)) {
                System.out.println("Вы ввели неправильные значения.");
                continue;
            }
            counts[productIndex] += productCount;

        }

        Utils.printBasket(products, prices, counts);
    }
}
