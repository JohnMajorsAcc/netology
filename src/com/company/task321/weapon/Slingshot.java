package com.company.task321.weapon;

public class Slingshot extends Weapon{
    private String name = "Рогатка деревянная, дубовая, с резинкой из противогаза.";
    public void shot() {
        super.shot();
        System.out.println(" из рогатки: ШМЯК");
    }

    public String getName() {
        return name;
    }

}
