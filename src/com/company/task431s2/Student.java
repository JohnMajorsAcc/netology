package com.company.task431s2;

import java.util.Objects;

public class Student {
    private String name;
    private String groupNumber;
    private final String studentTicketNumber;

    public Student(String name, String groupNumber, String studentTicketNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.studentTicketNumber = studentTicketNumber;
    }

    public Student(String studentTicketNumber) {
        this.studentTicketNumber = studentTicketNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getStudentTicketNumber() {
        return studentTicketNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentTicketNumber, student.studentTicketNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentTicketNumber);
    }

    @Override
    public String toString() {
        return name + " from group № " + groupNumber + " student ticket № " + studentTicketNumber;
    }
}
