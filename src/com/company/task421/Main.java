package com.company.task421;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> floorsQueue = new ArrayDeque<>();

        while (true) {
            int floor;
            try {
                floor = Utils.getFloor();
            } catch (RuntimeException e) {
                System.out.println("Wrong input.");
                continue;
            }
            if (floor == 0) {
                floorsQueue.add(floor);
                break;
            }
            if (Utils.checkFloor(floor))
                floorsQueue.add(floor);
             else
                System.out.println("Floor with № " + floor + " doesn't exist in this house.");

        }
        System.out.println("The elevator proceeded through the floors: ");

        int totalWait = 0;
        int waitDoorInSeconds = 10;
        int waitMoveInSeconds = 5;
        int previousFloor = -1;

        while (floorsQueue.peek() != null) {

            if (previousFloor != -1) {
                totalWait += Math.abs(floorsQueue.peek() - previousFloor) * waitMoveInSeconds + waitDoorInSeconds;
            }
            previousFloor = floorsQueue.peek();
            System.out.print(" -> floor " + floorsQueue.poll());
        }
        System.out.println("\nTime passed : " + totalWait + " seconds (" + totalWait/60 + " minutes " +  totalWait%60 + " seconds)");
    }
}
