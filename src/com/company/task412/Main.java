package com.company.task412;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("John", "Major", 33, Gender.MALE, Education.SECONDARY, Position.ENGINEER, "Renault"));
        employeeList.add(new Employee("Sam", "Brown", 33, Gender.MALE, Education.HIGHER, Position.DIRECTOR, "music"));
        employeeList.add(new Employee("Sara", "Gellar", 45, Gender.FEMALE, Education.PRIMARY, Position.FITTER, "movie"));

        while (true) {
            String firstName;
            String secondName;
            int age;
            Gender gender;
            Education education;
            Position position;
            String department;

            Employee employee;


            firstName = Utils.getFirstName();
            if (firstName.equals("end")) {
                break;
            }

            secondName = Utils.getSecondName();

            int isExists = Utils.checkEmployee(employeeList, firstName, secondName);
            boolean checkToEdit = false;

            try {
                if (isExists >= 0){
                    checkToEdit = Utils.checkToEdit();
                    if(!checkToEdit) {
                        continue;
                    } else {
                        employee = employeeList.get(isExists);
                    }
                } else {
                    employee = new Employee();
                }

                age = Utils.getAge();

                gender = Utils.getGender();

                education = Utils.getEducation();

                position = Utils.getPosition();

            } catch (WrongInputException | RuntimeException e) {
                System.out.println("Неправильный ввод.");
                continue;
            }

            department = Utils.getDepartment();

            employee.setFirstName(firstName);
            employee.setSecondName(secondName);
            employee.setAge(age);
            employee.setGender(gender);
            employee.setEducation(education);
            employee.setPosition(position);
            employee.setDepartment(department);

            if (!checkToEdit)
            employeeList.add(employee);
        }

        Utils.printEmployeeList(employeeList);
    }
}
