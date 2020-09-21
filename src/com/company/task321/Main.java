package com.company.task321;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player player = new Player();

        while (true) {
            player.printWeaponsSlotsList();
            int weaponSlot = getAnswer();
            if (weaponSlot == -1) {
                break;
            } else {
                player.shotWithWeapon(weaponSlot);
            }
        }

        System.out.println("Game over!");
    }

    private static int getAnswer() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер слота для выстрела (либо -1 для выхода):");
            try {
                int slot = scanner.nextInt();
                return slot;
            } catch (IllegalArgumentException exception) {
                System.out.println("Введено не число!");
            }
        }

    }
}
