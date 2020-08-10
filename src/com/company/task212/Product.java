package com.company.task212;

import org.jetbrains.annotations.NotNull;

public class Product implements Comparable<Product>{
    private String name;
    private int price;
    private String description;

    public Product(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name + "(price: " + price +", description: "+ description + ")" ;
    }

    @Override
    public int compareTo(@NotNull Product o) {
        return this.price - o.price;
    }
}
