package com.company.task321.weapon;

public class Pistol extends Weapon {
    private String name = "Кольт - миротворец";
    public void shot() {
        super.shot();
        System.out.println(" из пистолета: БАХ");
    }

    public String getName() {
        return name;
    }
}
