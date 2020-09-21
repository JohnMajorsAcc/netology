package com.company.task431var2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhoneContacts phoneContacts = new PhoneContacts();
        fillGroup(phoneContacts);
        fillContacts(phoneContacts);

        while (true) {

            System.out.println("Phone contacts. Choose operation (end to exit program):");
            System.out.println(" 1. Display list;\n 2. Add groups;\n 3. Add contact;\n 4. Sort contacts by name and display it; \n 5. Sort contacts by name lenght and display it.");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Closing program.");
                break;
            }
            if (input.equals("1")) {
                System.out.println(phoneContacts);
                continue;
            }

            if (input.equals("2")) {
                phoneContacts.addGroupsByInput(scanner);

                continue;
            }

            if (input.equals("3")) {
                phoneContacts.addContactToGroupsByInput(scanner);
                continue;
            }
            if (input.equals("4")) {
                phoneContacts.sortByContactName();
                System.out.println(phoneContacts);
                continue;
            }
            if (input.equals("5")) {
                phoneContacts.sortByNameLength();
                System.out.println(phoneContacts);
                continue;
            }
            System.out.println("You entered wrong number of operation.");

        }
    }

    private static void fillGroup(PhoneContacts phoneContacts) {
        phoneContacts.addGroup("Friends");
        phoneContacts.addGroup("Family");
        phoneContacts.addGroup("Taxi");
        phoneContacts.addGroup("Service");
        phoneContacts.addGroup("Job");
    }

    private static void fillContacts(PhoneContacts phoneContacts) {
        phoneContacts.addContact(
                new Contact("Sam", "2222"),
                "Friends"
        );
        phoneContacts.addContact(
                new Contact("Sam", "882342"),
                "Job"
        );
        phoneContacts.addContact(
                new Contact("Mom", "221222"),
                "Family"
        );
        phoneContacts.addContact(
                new Contact("Maxim", "2222"),
                "Taxi"
        );
        phoneContacts.addContact(
                new Contact("Alex", "12345"),
                "Taxi"
        );
        phoneContacts.addContact(
                new Contact("Alex", "12345"),
                "Job"
        );
        phoneContacts.addContact(
                new Contact("Sister", "432313"),
                "Family"
        );
        phoneContacts.addContact(
                new Contact("Sister", "432313"),
                "Friends"
        );
    }
}
