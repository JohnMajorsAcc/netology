package com.company.task341;

import com.company.task341.myexceptions.AccessDeniedException;
import com.company.task341.myexceptions.UserNotFoundException;

import java.util.List;
import java.util.Scanner;

public class Utils {

    public static final int CHECKAGE = 18;

    public static String getInput(String s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(s);
        return scanner.nextLine();
    }

    public static User findUser(List<User> users, String login, String password) throws UserNotFoundException {
        for (User user : users) {
            if (user.getLogin().equals(login) && (user.getPassword().equals(password))){
                return user;
            }
        }
        throw new UserNotFoundException();
    }

    public static void checkUserAge(User user) throws AccessDeniedException {
        if (user.getAge() < CHECKAGE) {
            throw new AccessDeniedException();
        }
    }
}
