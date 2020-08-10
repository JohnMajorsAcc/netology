package com.company.task212;

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {

        Product[] products = Utils.productsArrayMaker();

        System.out.println("Unsorted:");
        Utils.printArrayLineByLine(products);
        System.out.println();

        System.out.println("Sorted by native method sort (min-max): ");
        long start = System.currentTimeMillis();
        Arrays.sort(products);
        System.out.println("Затрачено времени : " + (- start + System.currentTimeMillis()) + " мс");
        Utils.printArrayLineByLine(products);
        System.out.println();

        System.out.println("Sorted by native method sort with comparator(max-min):");
        long start2 = System.currentTimeMillis();
        Arrays.sort(products, new MyComparator());
        System.out.println("Затрачено времени : " + (- start2 + System.currentTimeMillis()) + " мс");
        Utils.printArrayLineByLine(products);
        System.out.println();

        System.out.println("Sorted by heap sort (min-max):");
        long start3 = System.currentTimeMillis();
        Utils.heapSort(products);
        System.out.println("Затрачено времени : " + (-start2 + System.currentTimeMillis()) + " мс");
        Utils.printArrayLineByLine(products);
    }
}
