package com.company.task222;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 10;
    public static final int SHIPS = 10;
    public static final int EMPTY = 0;
    public static final int SHIP = 1;
    public static final int DEAD = 2;
    public static final int MISS = 3;
    public static final int NUMBER_OF_MOVIES = 30;
    public static int ship_miss = SHIPS;

    public static void main(String[] args) {

        int[][] warField = getMatrix(SIZE, SHIPS);
        int counter = 0;

        printMatrix(warField, true);

        System.out.println("Игра морской бой. 10 кораблей, 30 ходов - дерзайте.");

        int[] coords;

        while (counter < NUMBER_OF_MOVIES) {

            coords = getMoveXY(counter);
            warField = checkWarField(warField, coords);

            printMatrix(warField, true);
            if (ship_miss == 0) {
                System.out.println("Вы уничтожили все корабли. Браво!");
                break;
            }
            if (counter == NUMBER_OF_MOVIES - 1) {
                System.out.println("Вы не справились с задачей. Вот карта расположения противника:");
                printMatrix(warField, false);
                break;
            }
            counter++;
        }
    }

    private static int[][] checkWarField(int[][] warField, int[] coords) {
        switch (warField[coords[0]][coords[1]]) {
            case SHIP: {
                System.out.println("Отличный выстрел! Попадание.");
                warField[coords[0]][coords[1]] = DEAD;
                ship_miss--;
                break;
            }
            case DEAD: {
                System.out.println("Зачем палить по затопленным кораблям? Потерял ход!");
                break;
            }
            case EMPTY: {
                System.out.println("Промазал!");
                warField[coords[0]][coords[1]] = MISS;
                break;
            }
            case MISS: {
                System.out.println("Сюда уже был выстрел, но корабля так и нету!");
                break;
            }
        }
        return warField;
    }

    private static int[] getMoveXY(int counter) {
        Scanner scanner = new Scanner(System.in);
        int[] coords = {0, 0};
        while (true) {
            System.out.println("Ход " + (counter + 1) + ". Осталось кораблей противника : " + ship_miss + ". Введите координаты выстрела (два числа от 0 до 9 через пробел)");
            String str = scanner.nextLine();
            try {
                String[] parseString = str.split(" ");
                coords[0] = Integer.parseInt(parseString[0]);
                coords[1] = Integer.parseInt(parseString[1]);
                if (coords[0] > 9 || coords[0] < 0 || coords[1] > 9 || coords[1] < 0) {
                    System.out.println("Выход за пределы поля.");
                } else {
                    return coords;
                }
            } catch (RuntimeException e) {
                System.out.println("Неправильный ввод.");
            }
        }
    }

    private static void printMatrix(int[][] matrix, boolean hide) {
        System.out.printf("%3s", "v >");
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("%1d  ", i);
            for (int j = 0; j < matrix.length; j++) {
                if (hide == true && matrix[i][j] == SHIP) {
                    System.out.printf("%3d", EMPTY);
                } else {
                    System.out.printf("%3d", matrix[i][j]);
                }
            }
            System.out.println();
        }
    }

    private static int[][] getMatrix(int size, int ships) {
        Random random = new Random();
        int[][] warField = new int[size][size];
        for (int i = 0; i < ships; i++) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            if (warField[x][y] == EMPTY) {
                warField[x][y] = SHIP;
            } else {
                i--;
            }
        }
        return warField;
    }
}
