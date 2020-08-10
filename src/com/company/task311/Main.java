package com.company.task311;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Бродяги Севера", "Джеймс Оливер Кервуд", Status.ARCHIVED);
        Book book2 = new Book("Белый клык", "Джек Лондон", Status.AVAILABLE);
        Book book3 = new Book("Одиссея капитана Блада", "Рафаэль Саббатини", Status.BORROWED);
        Book book4 = new Book("Три мушкетера", "Александр Дюма", Status.OVERDUED);

        BookMover farsm = new FromArchiveStatusMover();
        BookMover fovsm = new FromOverduedStatusMover();
        BookMover favsm = new FromAvailableStatusMover();
        BookMover fbosm = new FromBorrowedStatusMover();

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        printBookList(bookList);

        while (true) {
            int[] answer = getAnswer(bookList.size());
            int answerBookNumber = answer[0];
            int answerStatusNumber = answer[1];
            if (answerBookNumber == -1){
                break;
            }

            int answerBookStatusNumber = bookList.get(answerBookNumber).getStatus().ordinal();

            Status answerStatus = getAnswerStatus(answerStatusNumber);

            switch (answerBookStatusNumber){
                case 0:{ //BORROWED
                    System.out.println("Перемещение книги " + bookList.get(answerBookNumber) + " в статус \"" + answerStatus.getDescription() + "\"");
                    fbosm.moveToStatus(bookList.get(answerBookNumber), answerStatus);
                    break;
                }
                case 1:{ //ARCHIVED
                    System.out.println("Перемещение книги " + bookList.get(answerBookNumber) + " в статус \"" + answerStatus.getDescription()  + "\"");
                    farsm.moveToStatus(bookList.get(answerBookNumber), answerStatus);
                    break;
                }
                case 2:{ //AVAILABLE
                    System.out.println("Перемещение книги " + bookList.get(answerBookNumber) + " в статус \"" + answerStatus.getDescription()  + "\"");
                    favsm.moveToStatus(bookList.get(answerBookNumber), answerStatus);
                    break;
                }
                case 3:{ //OVERDUED
                    System.out.println("Перемещение книги " + bookList.get(answerBookNumber) + " в статус \"" + answerStatus.getDescription()  + "\"");
                    fovsm.moveToStatus(bookList.get(answerBookNumber), answerStatus);
                    break;
                }
            }
            printBookList(bookList);
        }
    }

    private static Status getAnswerStatus(int i) {
        for(Status status: Status.values()){
            if (status.ordinal() == i){
                return status;
            }
        }
        return Status.UNKNOWN;
    }

    private static int[] getAnswer(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] answer = {0, 0};
        while (true) {
            System.out.println("Введите через пробел порядковый номер книги и номер перемещения ("
                    + Status.BORROWED.ordinal() + " - " + Status.BORROWED.getDescription() + ", "
                    + Status.ARCHIVED.ordinal() + " - "  + Status.ARCHIVED.getDescription() + ", "
                    + Status.AVAILABLE.ordinal() + " - " + Status.AVAILABLE.getDescription() + ", "
                    + Status.OVERDUED.ordinal() + " - " + Status.OVERDUED.getDescription() + "). <end> - выход из программы."
            );
            String str = scanner.nextLine();
            if (str.equals("end")){
                return new int[]{-1, -1};
            }
            try {
                String[] parseString = str.split(" ");
                answer[0] = Integer.parseInt(parseString[0]);
                answer[1] = Integer.parseInt(parseString[1]);
                if (answer[0] > size -1 || answer[0] < 0 || answer[1] > 3 || answer[1] < 0) {
                    System.out.println("Неправильное значение ввода.");
                } else {
                    return answer;
                }
            } catch (RuntimeException e) {
                System.out.println("Неправильный ввод.");
            }
        }
    }

    private static void printBookList(List<Book> bookList) {
        System.out.println("Список книг:");
        for (int i = 0; i < bookList.size(); i++){
            System.out.println(i + ". " + bookList.get(i));
        }
    }
}
