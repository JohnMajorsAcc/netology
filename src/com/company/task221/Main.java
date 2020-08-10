package com.company.task221;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int size = getMatrixSize();
        int[][] colors = new int[size][size];
        colors = getMatrix(size);
        System.out.println("Исходная матрица:");
        printMatrix(colors);

        int angle = getAngle();
        switch (angle){
            case 90: {
                printAngle(angle);
                printMatrix(rotateMatrix(colors));
                break;
            }
            case 180: {
                printAngle(angle);
                printMatrix(rotateMatrix(rotateMatrix(colors)));
                break;
            }
            case 270: {
                printAngle(angle);
                printMatrix(rotateMatrix(rotateMatrix(rotateMatrix(colors))));
                break;
            }
        }
    }
    private static void printAngle(int angle) {
        System.out.println("Поворот матрицы на " + angle + " градусов:");
    }
    private static int getAngle() {
        int angle = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите угол поворота матрицы (90, 180 или 270)");
        try {
            angle = scanner.nextInt();
            if (angle != 90 && angle != 180 && angle != 270) {
                System.out.println("Введен неверный угол. ");
                getAngle();
            }
        } catch (InputMismatchException e){
            System.out.println("Введено не число.");
            getAngle();
        }
        return angle;
    }
    private static int getMatrixSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы (1..50)");
        int size = 0;
        try {
            size = scanner.nextInt();
            if (size > 50 || size < 1) {
                System.out.println("Введен неверный размер матрицы.");
                getMatrixSize();
            }
        } catch (Exception e) {
            e.printStackTrace();
            getMatrixSize();
        }
        return size;
    }
    private static int[][] rotateMatrix(int[][] colors) {
        int[][] rotatedColors = new int[colors.length][colors.length];
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                rotatedColors[i][j] = colors[colors.length - 1 - j][i];
            }
        }
        return rotatedColors;
    }
    private static void printMatrix(int[][] colors) {
        System.out.printf("%6s", "v >");
        for (int i = 0; i < colors.length; i++) {
            System.out.printf("%6d", i);
        }
        System.out.println();
        for (int i = 0; i < colors.length; i++) {
            System.out.printf("%4d  ", i);
            for (int j = 0; j < colors.length; j++) {
                System.out.printf("%6d", colors[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] getMatrix(int size) {
        Random random = new Random();
        int[][] colors = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        return colors;
    }
}
