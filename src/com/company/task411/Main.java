package com.company.task411;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Сделать ДЗ", LocalTime.of(12, 00), "Пересмотреть вебинар и выполнить задания 1 и 2"));
        taskList.add(new Task("Перекусить", LocalTime.of(14, 00), "Налить кофе и съесть бутерброд2"));

        while (true) {
            System.out.println(Utils.greeting);
            int answer = 0;
            try {
                answer = Integer.parseInt(Utils.getAnswer());
                Utils.checkAnswer(answer);
            } catch (RuntimeException | ActionOutOfBoundException e) {
                System.out.println("Введен неправильный номер действия.");
                continue;
            }

            if (answer == 0) {
                System.out.println("Завершение программы.");
                break;
            }

            switch (answer) {
                case (1): {
                    try {
                        Utils.addNewTask(taskList);
                    } catch (RuntimeException e) {
                        System.out.println("Неверный формат даты. Операция добавления новой задачи прервана.");
                    }
                    break;
                }
                case (2): {
                    Utils.printTaskList(taskList);
                    break;
                }
                case (3): {
                    try {
                        Utils.deleteTaskFromList(taskList);
                    } catch (ActionOutOfBoundException e) {
                        e.printStackTrace();
                    }
                    break;
                }
            }
        }
    }
}
