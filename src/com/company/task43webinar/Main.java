package com.company.task43webinar;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Storage storage1 = new Storage("first", "lenina street 15");
        Storage storage2 = new Storage("second", "pushkina 11");

        Product milk = new Product("123-mlk", "Derevenskoe", 50);
        Product tea = new Product("456-tea", "GreenFied", 100);
        Product bananas = new Product("789-bnn", "MaroccoBananas", 70);
        Product coffee = new Product("135-cfe" , "Jacobs", 200);

        Map<Product, Integer> productMap1 = new HashMap<>();
        productMap1.put(milk, 200);
        productMap1.put(tea, 100);
        productMap1.put(bananas, 300);

        Map<Product, Integer> productMap2 = new HashMap<>();
        productMap2.put(coffee, 100);
        productMap2.put(tea, 400);
        productMap2.put(bananas, 200);

        Map<Storage, Map<Product, Integer>> storageMap = new HashMap<>();
        storageMap.put(storage1, productMap1);
        storageMap.put(storage2, productMap2);

        displayAll(storageMap);

        searchProduct(storageMap, "456-tea");

    }

    private static void searchProduct(Map<Storage, Map<Product, Integer>> storageMap, String productNumber) {
        for (Storage storage : storageMap.keySet()) {
            Map<Product, Integer> productMap = storageMap.get(storage);
            Integer amount = productMap.get(new Product(productNumber));
            if (amount != null){
                System.out.println("Storage " + storage.getName() + " contains " + amount + " with number " + productNumber);
            }
        }
    }

    private static void displayAll(Map<Storage, Map<Product, Integer>> storageMap) {
        for (Map.Entry<Storage, Map<Product, Integer>> storageEntry : storageMap.entrySet()) {
            System.out.println("*Storage <" + storageEntry.getKey().getName() + "> (address :" + storageEntry.getKey().getAddress() + ") contains :*" );
            for (Map.Entry<Product, Integer> productEntry : storageEntry.getValue().entrySet()) {
                System.out.println(productEntry.getKey() + " <" + productEntry.getValue() + ">");
            }
            System.out.println("********************************************************");
        }
    }
}
