package com.company.task431s2;

import java.util.HashSet;
import java.util.Set;

public class StudentsSet {
    private Set<Student> students = new HashSet<>();

    public boolean addStudent(Student student) {
        return students.add(student);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student + "\n");
        }
        return sb.toString();
    }


    public void addStudentByInput(Student student) {
        if (students.add(student)){
            System.out.println("Student added to the List successfully.");
        } else {
            System.out.println("Operation didn't complete. Student with ticket № " + student.getStudentTicketNumber() + " is already exist in the List.");
        }
    }

    public void removeStudentByInput(String ticketNumber) {
        for (Student student : students) {
            if (student.getStudentTicketNumber().equals(ticketNumber)) {
                students.remove(student);
                System.out.println("Student " + student + " was successfully removed.");
                return;
            }
        }
        System.out.println("Student with ticket № " + ticketNumber + " wasn't found.");
    }
}
