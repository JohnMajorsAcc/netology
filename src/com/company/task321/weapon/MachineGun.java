package com.company.task321.weapon;

public class MachineGun extends Weapon {
    private String name = "Автомат АК74М";
    public void shot() {
        super.shot();
        System.out.println(" из автомата: БАХ-БАХ-БАХ");
    }

    public String getName() {
        return name;
    }
}
