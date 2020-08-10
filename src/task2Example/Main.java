package task2Example;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TransportSchedule[] schedule = new TransportSchedule[10];
        int counter = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите через пробел тип транспорта, номер маршрута и время прибытия в формате hh:MM");
            System.out.println("end для выхода из программы");
            String str = scanner.next();
            if (str.equals("end") || counter == 10) {
                System.out.println("Завершение программы.");
                break;
            }

            Transport transport = Transport.valueOf(str);
            String route = scanner.next();
            LocalTime time = LocalTime.parse(scanner.next());
            schedule[counter] = new TransportSchedule(transport, route, time);
            counter++;


            scanner.nextLine();
            System.out.println("");

            Arrays.sort(schedule, 0, counter, new RoutComparator());

            System.out.println("Тип транспорта --- Маршрут --- Время прибытия");
            for (int i = 0; i < counter; i++) {
                System.out.printf(" %14s %11s %18s\n", schedule[i].getType().getTranslate(), schedule[i].getRoute(), schedule[i].getTime());
            }
        }
    }
}
