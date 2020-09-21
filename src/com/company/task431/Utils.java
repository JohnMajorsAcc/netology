package com.company.task431;

import java.lang.reflect.Array;
import java.util.*;

public class Utils {
    public static void display(Map<String, List<Contact>> contactMap) {
        System.out.println("================================================================================================");
        for (Map.Entry<String, List<Contact>> entry : contactMap.entrySet()) {
            System.out.println(entry.getKey());
            for (Contact contact : entry.getValue()) {
                System.out.println(contact);
            }
            System.out.println("________________________________________________________________________________________________");
        }
    }

    public static String getInput(Scanner scanner) {
        return scanner.nextLine();
    }

    public static void addGroup(Map<String, List<Contact>> contactMap, Scanner scanner) {
        System.out.println("Add group operation.");
        System.out.println("Please Enter Groups in line, separate it with <, >");
        String[] groups = scanner.nextLine().trim().split(", ");
        for (String group : groups) {
            if (contactMap.keySet().contains(group)) {
                System.out.println("Group with name <" + group + "> is already exists");
            } else {
                contactMap.put(group, new ArrayList<>());
                System.out.println("Group with name <" + group + "> added successfully!");
            }
        }
    }

    public static void addContact(Map<String, List<Contact>> contactMap, Scanner scanner) {
        System.out.println("Add contact operation.");
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter second name:");
        String secondName = scanner.nextLine();
        System.out.println("Enter organisation:");
        String organisation = scanner.nextLine();
        System.out.println("Enter position:");
        String position = scanner.nextLine();
        System.out.println("Enter phone number:");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter groups to add you contact in line, separate it with <, >");
        String[] groups = scanner.nextLine().trim().split(", ");
        Contact newContact = new Contact(firstName, secondName, organisation, position, phoneNumber);
        for (String group : groups) {
            if (!contactMap.keySet().contains(group)) {
                System.out.println("Group with name <" + group + "> doesn't exist yet.");
                contactMap.put(group, new ArrayList<Contact>());
         }
            contactMap.get(group).add(newContact);
            System.out.println("New contact added to group <" + group + "> successfully!");
        }

    }

    public static void removeGroup(Map<String, List<Contact>> contactMap, Scanner scanner) {
        System.out.println("Remove group operation.");
        System.out.println("Please Enter Groups in line, separate it with <, >");
        String[] groups = scanner.nextLine().trim().split(", ");
        for (String group : groups) {
            if (!contactMap.keySet().contains(group)) {
                System.out.println("Group with name <" + group + "> doesn't exist yet.");
            } else {
                contactMap.remove(group);
                System.out.println("Group with name <" + group + "> removed successfully!");
            }
        }
    }

    public static void removeContact(Map<String, List<Contact>> contactMap, Scanner scanner) {
        System.out.println("Remove contact operation.");
        System.out.println("Please, enter phone number of contact to remove:");
        String contactNumberInput = scanner.nextLine();
        System.out.println("Please, enter the name of the group from which must be removed contact:");
        String groupInput = scanner.nextLine();
        if (contactMap.containsKey(groupInput)){
                contactMap.get(groupInput).remove(new Contact(contactNumberInput));
            System.out.println("Contact with number " + contactNumberInput + " from group " + groupInput + " removed successfully.");
            }
        }

    }
