package com.company.task431s2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String END = "end";
        final String DELIMITER = ", ";
        final String STRING_DELIMITER = "=======================================================";

        StudentsSet studentsSet = new StudentsSet();

        fill(studentsSet);

        while (true) {
            System.out.println(STRING_DELIMITER);
            System.out.println("Students List (choose operation with a number or type <end> to quit.");
            System.out.println("1. Display List of Students; \n2. Add a new Student to the List; \n3. Remove Student from the List by ticket number");
            String input = scanner.nextLine();
            if (input.equals(END)) {
                System.out.println("Closing program.");
                break;
            }
            if (input.equals("1")) {
                System.out.println(studentsSet);
            }
            if (input.equals("2")) {
                System.out.println("Enter student name, number of group, number of student's ticket (with delimiter <" + DELIMITER + ">)");
                String[] splitedInput = scanner.nextLine().split(DELIMITER);
                if (splitedInput.length != 3) {
                    System.out.println("Wrong input!");
                    continue;
                } else {
                    studentsSet.addStudentByInput(new Student(splitedInput[0], splitedInput[1], splitedInput[2]));
                    continue;
                }
            }
            if (input.equals("3")){
                System.out.println("Enter the Student's ticket number");
                studentsSet.removeStudentByInput(scanner.nextLine());
                continue;
            }

        }
    }

    private static void fill(StudentsSet studentsSet) {
        studentsSet.addStudent(new Student("Ivanov Ivan", "123-A", "E144233"));
        studentsSet.addStudent(new Student("Petrov Petr", "123-A", "E144234"));
        studentsSet.addStudent(new Student("Mikhailov Mikhail", "124-A", "E144235"));
        studentsSet.addStudent(new Student("Ivanov Ivan", "124-A", "E144236"));
    }

}
