package com.company.task412;

public class Employee {
    private String firstName;
    private String secondName;
    private int age;
    private Gender gender;
    private Education education;
    private Position position;
    private String department;

    public Employee() {
    }

    public Employee(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Employee(String firstName, String secondName, int age, Gender gender, Education education, Position position, String department) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.gender = gender;
        this.education = education;
        this.position = position;
        this.department = department;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
