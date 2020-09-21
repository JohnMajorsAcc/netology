package com.company.task321.weapon;

public class WaterPistol extends Weapon{
    private String name = "Водяной пистолет";
    public void shot() {
        super.shot();
        System.out.println(" из водяного пистолета: ПИУ-ПИУ");
    }

    public String getName() {
        return name;
    }
}
