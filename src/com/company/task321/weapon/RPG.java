package com.company.task321.weapon;

public class RPG extends Weapon {
    private String name = "РПГ-7";

    public void shot() {
        super.shot();
        System.out.println(" из ручного противотанкового гранатомета: фьють - БУМ");
    }

    public String getName() {
        return name;
    }
}
