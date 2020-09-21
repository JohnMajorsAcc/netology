package com.company.task341;

import com.company.task341.myexceptions.AccessDeniedException;
import com.company.task341.myexceptions.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User(1, "John", "Snow", "jonneg", "undead", "josn@wint.com", 25));
        users.add(new User(2, "Dow", "Jones", "dd2020", "market201", "dd@google.com", 35));
        users.add(new User(3, "Little", "Big", "lbBig20", "qwerty123", "lb@yandex.com", 17));
        users.add(new User(4, "Test", "Test", "Test", "Test", "Test", 18));
        users.add(new User(5, "test", "test", "test", "test", "test", 10));


        while (true) {
            System.out.println("Access determination program. Type <end> to exit.");
            String login = Utils.getInput("Input login:");
            if (login.equals("end")) {
                System.out.println("Program closed.");
                break;
            }
            String password = Utils.getInput("Input password:");
            try {
                User user = (Utils.findUser(users, login, password));
                Utils.checkUserAge(user);
                System.out.println("Welcome, <" + user.getFirstName() + ">. Access granted!");
            } catch (AccessDeniedException e) {
                System.out.println(e.getMessage());
            } catch (UserNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
