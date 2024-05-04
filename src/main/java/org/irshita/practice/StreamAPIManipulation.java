package org.irshita.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamAPIManipulation {
    public static void main(String[] args) {
        Employee employee1 = new Employee(431, "Patel", 500000.00, "HR");
        Employee employee2 = new Employee(876, "Ashutosh", 700000.00, "IT");
        Employee employee3 = new Employee(421, "Irshita", 100000.00, "DEV");
        Employee employee4 = new Employee(498, "Sangita", 900000.00, "IT");
        Employee employee5 = new Employee(408, "Kaushal", 400000.00, "HR");
        Employee employee6 = new Employee(412, "Rajdev", 300000.00, "HR");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);


    }
}
