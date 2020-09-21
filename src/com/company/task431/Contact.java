package com.company.task431;

import java.util.Objects;

public class Contact {
    private String firstName;
    private String secondName = "not entered";
    private String organisation = "not entered";
    private String position = "not entered";
    private final String phoneNumber;

    public Contact(String firstName, String phoneNumber) {
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }


    public Contact(String firstName, String secondName, String organisation, String position, String phoneNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.organisation = organisation;
        this.position = position;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

    @Override
    public String toString() {
        return firstName + " " + secondName + " (Место работы: " + organisation + ", должность " + position + ")" + " phone number : " + phoneNumber;
    }
}



