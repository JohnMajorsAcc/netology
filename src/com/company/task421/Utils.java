package com.company.task421;

import java.util.Scanner;

public class Utils {
    private final static int FIRST_FLOOR = 1;
    private final static int LAST_FLOOR = 25;
    public static int getFloor() throws RuntimeException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input floor number (1-25) or 0 to end the program.");
        return Integer.parseInt(scanner.nextLine());
    }

    public static boolean checkFloor(int floor) {
        return  floor >= FIRST_FLOOR && floor <= LAST_FLOOR;
    }
}
