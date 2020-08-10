package com.company.task211;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

    private static final String SPLITTER = ";;";

    public static void addProductToFile(File file) {

        List productList = getListFromFile(file);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            String productName = getNameOfProduct(productList);
            int productUnitOrdinal = getUnitOfProduct().ordinal();
            int productPrice = getPriceOfProduct();
            fileWriter.write(productList.size() + SPLITTER + productName + SPLITTER + productUnitOrdinal + SPLITTER + productPrice + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    private static Unit getUnitOfProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Доступные единицы измерения: ");
        for (Unit unit : Unit.values()) {
            System.out.println(unit.ordinal() + " " + unit.getTranslation());
        }
        System.out.println("Введите единицу измерения продукта: ");
        int unitOrdinal;
        try {
            unitOrdinal = scanner.nextInt();
            if (unitOrdinal < 0 || unitOrdinal > Unit.values().length - 1) {
                System.out.println("Неправильный ввод. Пожалуйста, повторите операцию ввода.");
                return getUnitOfProduct();
            }
            return Unit.getUnitByOrdinal(unitOrdinal);
        } catch (RuntimeException exception) {
            System.out.println("Неправильный ввод. Пожалуйста, повторите операцию ввода.");
            return getUnitOfProduct();
        }
    }


    private static int getPriceOfProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость продукта: ");

        int valueRub;   // рубли
        int valueKop;   // копейки
        try {
            System.out.print("рублей: ");
            valueRub = scanner.nextInt();
            System.out.print("копеек: ");
            valueKop = scanner.nextInt();

            if (valueRub < 0 || valueKop < 0) {
                System.out.println("Неправильный ввод. Пожалуйста, повторите операцию ввода.");
                return getPriceOfProduct();
            }
            return valueRub * 100 + valueKop;
        } catch (RuntimeException exception) {
            System.out.println("Неправильный ввод. Пожалуйста, повторите операцию ввода.");
            return getPriceOfProduct();
        }
    }

    private static String getNameOfProduct(List productList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя продукта:");

        String nameOfProduct;
        try {
            nameOfProduct = scanner.nextLine();
            if (checkProductName(nameOfProduct, productList)) {
                System.out.println("Неправильный ввод (такое имя продукта уже есть). Пожалуйста, повторите операцию ввода.");
                return getNameOfProduct(productList);
            }
            if (nameOfProduct.length() < 3) {
                System.out.println("Неправильный ввод (название меньше 3 букв). Пожалуйста, повторите операцию ввода.");
                return getNameOfProduct(productList);
            }
            return nameOfProduct;
        } catch (RuntimeException exception) {
            System.out.println("Неправильный ввод. Пожалуйста, повторите операцию ввода.");
            return getNameOfProduct(productList);
        }
    }

    private static boolean checkProductName(String nameOfProduct, List<Product> productList) {
        return productList.stream()
                .anyMatch(e -> e.getName().equals(nameOfProduct));
    }

    public static List<Product> getListFromFile(File file) {
        List<Product> productList = new ArrayList<>();
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(SPLITTER);
                Product product = new Product(
                        Integer.parseInt(words[0]),
                        words[1],
                        Unit.getUnitByOrdinal(Integer.parseInt(words[2])),
                        Integer.parseInt(words[3]));
                productList.add(product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        ;
        return productList;
    }

    public static void printProducts(File file) {
        List<Product> productList = getListFromFile(file);
        productList.stream()
                .forEachOrdered(System.out::println);
    }

    public static String getAnswer() {
        Scanner scanner = new Scanner(System.in);
        String answer;
        answer = scanner.nextLine();
        return answer;


    }

    public static int getProductId(String answer) {
        return Integer.parseInt(answer.split(" ")[0]);
    }

    public static int getQuantity(String answer) {
        return Integer.parseInt(answer.split(" ")[1]);
    }
}