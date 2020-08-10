package com.company.task212;

import java.util.Random;
import java.util.Scanner;

public class Utils {
    final static String lettersU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final static String lettersD = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();


    public static void heapSort(Product arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0].getPrice();
            arr[0].setPrice(arr[i].getPrice());
            arr[i].setPrice(temp);

            heapify(arr, i, 0);
        }
    }

    private static void heapify(Product[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l].getPrice() > arr[largest].getPrice())
            largest = l;

        if (r < n && arr[r].getPrice() > arr[largest].getPrice())
            largest = r;

        if (largest != i) {
            int swap = arr[i].getPrice();
            arr[i].setPrice(arr[largest].getPrice());
            arr[largest].setPrice(swap);

            heapify(arr, n, largest);
        }
    }

    public static Product[] productsArrayMaker() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемое количество элементов массива объектов класса Product:");
        int count = scanner.nextInt();
        Product[] products = new Product[count];

        for (int j = 0; j < count; j++){
            products[j] = new Product(getName(lettersU), random.nextInt(200), getName(lettersD));
        }
        return products;
    }

    private static String getName(String letters){
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3 + random.nextInt(5); i++ ){
            sb.append(letters.charAt(random.nextInt(letters.length())));
        }
        return sb.toString();
    }

    public static void printArrayLineByLine(Product[] arr) {
        for (Product product : arr) {
            System.out.println(product);
        }
    }
}
