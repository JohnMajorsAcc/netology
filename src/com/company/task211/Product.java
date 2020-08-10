package com.company.task211;


public class Product {
    private int id;
    private String name;
    private Unit unit;
    private int price;



    public Product() {
    }

    public Product(int id, String name, Unit unit, int price) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return id + ". " + name + " (единица измерения: " + unit.getTranslation() + ") цена: " + price/100 + " рублей, " + price%100 + " копеек";
    }


}
