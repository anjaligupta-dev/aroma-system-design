package class_05.goodDesignSRP;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "abc", new Date());
        System.out.println("Employee id : " + emp.getId()); // Employee id : 1
        System.out.println("Employee name : " + emp.getName()); // Employee name : abc
        System.out.println("Employee date of joining : " + emp.getDoj());  // Employee date of joining : Sun Nov 02 15:20:09 EST 2025

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        salaryCalculator.calculateSalary(emp);  // Logic for calculating salary.

        EmployeeHiring employeeHiring = new EmployeeHiring();
        employeeHiring.hireEmployee(emp);   // Logic for hiring employee.

        EmployeeEvaluator employeeEvaluator = new EmployeeEvaluator();
        employeeEvaluator.evaluateEmployee(emp);    // Logic for evaluating team.
    }
}
