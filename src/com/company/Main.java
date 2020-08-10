package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        User jpbelmondo = new User("Жан Поль", "Бельмондо", "belpol@francemail.com");
        users.add(jpbelmondo);

        User jrenau = new User("Жан", "Рено", "jrrrr@belg.mail.com");
        users.add(jrenau);

        User brwil = new User("Брюс", "Уиллис", "dieharder@gmail.com");
        users.add(brwil);

        System.out.println("C нами:");
        users.stream()
                .forEach((p)-> System.out.println(p.getName()));

        System.out.println("Всего онлайн: " + User.totalOnline);
   }
}