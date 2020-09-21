package com.company.task411;

import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class Utils {
    private static int firstActionNumber = 0;
    private static int lastActionNumber = 3;

    static String greeting = "Выберите действие:\n" +
            "1. Добавить задачу\n" +
            "2. Вывести список задач\n" +
            "3. Удалить задачу\n" +
            "0. Выход";

    public static String getAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    public static void addNewTask(List<Task> taskList) throws RuntimeException {
        System.out.println("Операция добавления задачи.");

        System.out.println("Введите название задачи:");
        Task task = new Task(getAnswer());

        System.out.println("Введите время начала заачи (в формате hh:mm):");
        task.setTime(LocalTime.parse(getAnswer()));

        System.out.println("Введите описание задачи:");
        task.setDescription(getAnswer());

        taskList.add(task);
    }

    public static void printTaskList(List<Task> taskList) {
        System.out.println("Список задач:");
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println(i + ". " + taskList.get(i));
        }
        ;
    }

    public static void deleteTaskFromList(List<Task> taskList) throws RuntimeException, ActionOutOfBoundException {
        System.out.println("Операция удаления задачи.");

        printTaskList(taskList);
        System.out.println("Введите номер задачи для удаления");
        int delIndex = Integer.parseInt(getAnswer());
        if (delIndex < 0 || delIndex > taskList.size() - 1)
            throw new ActionOutOfBoundException("В списке нет задачи с таким номером.");
        System.out.println("Удаление задачи " + taskList.get(delIndex) + ".");
        taskList.remove(delIndex);
        System.out.println("Задача успешно удалена.");
    }

    public static void checkAnswer(int answer) throws ActionOutOfBoundException {
        if (answer > lastActionNumber || answer < firstActionNumber) {
            throw new ActionOutOfBoundException("Нет такого действия.");
        }
    }
}
