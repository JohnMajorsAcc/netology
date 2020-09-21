package com.company.task43webinar;

import java.util.Objects;

public class Product {

    private final String number;
    private String name;
    private int price;

    public Product(String number) {
        this.number = number;
    }

    public Product(String number, String name, int price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return number.equals(product.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return name + " (" + number + ") price: " + price;
    }
}
