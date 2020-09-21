package com.company.task321;

import com.company.task321.weapon.*;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Pistol(),
                new MachineGun(),
                new WaterPistol(),
                new RPG(),
                new Slingshot()

        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot > weaponSlots.length || slot < 0) {
            System.out.println("нет такого оружия в слотах!");
            return;
        }
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }

    public void printWeaponsSlotsList() {
        for (int i = 0; i < weaponSlots.length; i++) {
            System.out.println(i + ". " + weaponSlots[i].getName());
        }
    }
}
