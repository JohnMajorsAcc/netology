package com.company.task431var2;

import java.util.*;

public class PhoneContacts {
    private Map<String, List<Contact>> contacts = new HashMap<>();

    public PhoneContacts(){}

    public boolean addGroup(String groupName){
        if(!contacts.containsKey(groupName)) {
            contacts.put(groupName, new ArrayList<>());
            return true;
        } return false;
    }

    public boolean addContact(Contact contact, String groupName){
        List<Contact> targetGroupContacts = contacts.get(groupName);
        if(targetGroupContacts == null){
            return false;
        }
        targetGroupContacts.add(contact);
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<Contact>> entry : contacts.entrySet()) {
            sb
                    .append(entry.getKey())
                    .append("\n");
            for (Contact contact : entry.getValue()) {
                sb
                        .append("\t")
                        .append(contact)
                        .append("\n");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void sortByContactName() {
        for (Map.Entry<String, List<Contact>> entry : contacts.entrySet()) {
            entry.getValue().sort( (o1, o2) -> o1.getName().compareTo(o2.getName()));
        }
    }

    public void sortByNameLength() {
        for (Map.Entry<String, List<Contact>> entry : contacts.entrySet()) {
            entry.getValue().sort((o1, o2) -> o1.getName().length() - o2.getName().length());
        }
    }

    public void addContactToGroupsByInput(Scanner scanner) {
        System.out.println("Input name of contact: ");
        String name = scanner.nextLine();
        System.out.println("Input phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Input name of groups to add this contact, with delimiter <spacebar>");
        String groups = scanner.nextLine();
        for (String group : groups.split(" ")) {
            if (addContact(new Contact(name, phoneNumber), group)) {
                System.out.println("Contact was added to group <" + group + "> successfully.");
            } else {
                System.out.println("Contact was not added to group <" + group + ">.");
            }
        }
    }

    public void addGroupsByInput(Scanner scanner) {
        System.out.println("Input name of groups, with delimiter <spacebar>");
        String groups = scanner.nextLine();
        for (String group : groups.split(" ")) {
            addGroup(group);
        }
    }
}
