package com.company.task412;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Utils {
    public static boolean checkToEdit() throws WrongInputException {
        System.out.println("Employee with this first name and second name is already exists. Do you want to edit fields? (yes/no)");
        String answer = getAnswer();
        if (answer.equals("yes"))
            return true;
        else if (answer.equals("no"))
            return false;
        else
            throw new WrongInputException();
    }

    ;

    public static String getAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    public static String getFirstName() {
        System.out.println("Input first name or <end> to quit, please:");
        return getAnswer();
    }

    public static String getSecondName() {
        System.out.println("Input second name, please:");
        return getAnswer();
    }

    public static int checkEmployee(List<Employee> employeeList, String firstName, String secondName) {
        for (Employee employee : employeeList) {
            if (employee.getFirstName().equals(firstName) && employee.getSecondName().equals(secondName)){
                return employeeList.indexOf(employee);
            }
        }
        return -1;
    }

    public static int getAge() throws RuntimeException, WrongInputException {
        System.out.println("Input age, please:");
        int age = Integer.parseInt(getAnswer());
        if (age < 0 || age > 120)
            throw new WrongInputException();
        else
            return age;

    }

    public static Gender getGender() throws RuntimeException, WrongInputException {
        System.out.println("Input number of gender from list:");
        Gender[] listOfGenders = Gender.values();
        for (int i = 0; i < listOfGenders.length; i++) {
            System.out.println(i + ". " + listOfGenders[i]);
        }
        int answer = Integer.parseInt(getAnswer());
        if (answer < 0 || answer > listOfGenders.length - 1)
            throw new WrongInputException();
        else
            return Gender.valueOf(listOfGenders[answer].toString());
    }

    public static Education getEducation() throws RuntimeException, WrongInputException {
        System.out.println("Input number of education from list:");
        Education[] listOfEducation = Education.values();
        for (int i = 0; i < listOfEducation.length; i++) {
            System.out.println(i + ". " + listOfEducation[i]);
        }
        int answer = Integer.parseInt(getAnswer());
        if (answer < 0 || answer > listOfEducation.length - 1)
            throw new WrongInputException();
        else
            return Education.valueOf(listOfEducation[answer].toString());
    }

    public static Position getPosition() throws RuntimeException, WrongInputException {
        System.out.println("Input number of position from list:");
        Position[] listOfPosition = Position.values();
        for (int i = 0; i < listOfPosition.length; i++) {
            System.out.println(i + ". " + listOfPosition[i]);
        }
        int answer = Integer.parseInt(getAnswer());
        if (answer < 0 || answer > listOfPosition.length - 1)
            throw new WrongInputException();
        else
            return Position.valueOf(listOfPosition[answer].toString());
    }

    public static String getDepartment() {
        System.out.println("Input department, please:");
        return getAnswer();
    }

    public static void printEmployeeList(List<Employee> employeeList) {
        System.out.println("Employee list:");
        System.out.format("%5s %20s %20s %10s %10s %20s %20s %20s %n", "№", "First name", "Second name", "Age", "Gender", "Education", "Position", "Department");
        int counter = 0;
        for (Employee employee : employeeList) {
            System.out.format("%5s %20s %20s %10s %10s %20s %20s %20s %n",
                    counter++,
                    employee.getFirstName(),
                    employee.getSecondName(),
                    employee.getAge(),
                    employee.getGender(),
                    employee.getEducation(),
                    employee.getPosition(),
                    employee.getDepartment());
        }
    }
}


