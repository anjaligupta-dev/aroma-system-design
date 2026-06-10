package class_05.badDesign;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "abc", new Date());
        System.out.println("Employee id : " + emp.getId());  // Employee id : 1
        System.out.println("Employee name : " + emp.getName()); // Employee name : abc
        System.out.println("Employee date of joining : " + emp.getDoj());   // Employee date of joining : Sun Nov 02 15:13:51 EST 2025
        emp.hireEmployee(); // Logic for hiring employee.
        emp.calculateSalary();  // Logic for calculating salary.
        emp.evaluateEmployee(); // Logic for evaluating team.
    }
}
