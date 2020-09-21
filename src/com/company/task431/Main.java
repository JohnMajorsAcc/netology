package com.company.task431;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Contact contact1 = new Contact("John", "+79521792189");
        Contact contact2 = new Contact("Fred", "+79232234113");
        Contact contact3 = new Contact("Vasya", "Pupkin", "Delivery", "courier", "23454322234");
        Contact contact4 = new Contact("Dad", "89521234334");
        Contact contact5 = new Contact("Vika", "12345678");

        List<Contact> relatives = new ArrayList<>();
        List<Contact> friends =   new ArrayList<>();
        List<Contact> service =   new ArrayList<>();

        PhoneContacts phoneContacts = new PhoneContacts();



        //relatives
        relatives.add(contact1);
        relatives.add(contact4);

        //friends
        friends.add(contact1);
        friends.add(contact5);

        //service
        service.add(contact3);
        service.add(contact2);



        phoneContacts.groupMap.put("Relatives", relatives);
        phoneContacts.groupMap.put("Friends", friends);
        phoneContacts.groupMap.put("Service", service);

        while(true) {
            System.out.println("Phone Catalog. Choose operation: ");
            System.out.println("1. Print catalog");
            System.out.println("2. Add Group");
            System.out.println("3. Remove Group");
            System.out.println("4. Add Contact");
            System.out.println("5. Remove Contact from Group");
            System.out.println("6. Exit");

            boolean exitFlag = false;
            do {
                String input = Utils.getInput(scanner);
                if (input.equals("1")){
                    Utils.display(phoneContacts.groupMap);
                    break;
                }
                if(input.equals("2")){
                    Utils.addGroup(phoneContacts.groupMap, scanner);
                    break;
                }

                if(input.equals("3")){
                    Utils.removeGroup(phoneContacts.groupMap, scanner);
                    break;
                }
                if(input.equals("4")){
                    Utils.addContact(phoneContacts.groupMap, scanner);
                    break;
                }
                if(input.equals("5")){
                    Utils.removeContact(phoneContacts.groupMap, scanner);
                    break;
                }
                if(input.equals("6")){
                    exitFlag = true;
                    break;
                }
                System.out.println("Wrong input. Please, try again.");
            } while(true);
            if (exitFlag){
                System.out.println("You chose exit program. Bye!");
                break;
            }
        }
    }
}
