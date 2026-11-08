
package com.mycompany.payrollsystem;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class PayrollSystem {

public static void main(String[] args) {

    FullTime emp1 = new FullTime(
        "101", "Ahmed", 5000,
        LocalDate.of(2022, 1, 10), 1000
    );

    Contractor emp2 = new Contractor(
        "102", "Ali",
        LocalDate.of(2023, 5, 15), 50, 100
    );

    FullTime emp3 = new FullTime(
        "103", "Omar", 7000,
        LocalDate.of(2021, 3, 20), 1500
    );

    ArrayList<Employee> employees = new ArrayList<>();

    employees.add(emp1);
    employees.add(emp2);
    employees.add(emp3);

    System.out.println("EMPLOYEE PAYROLL");
    System.out.println("====================");

    for (Employee e : employees) {

        System.out.println(e);

        System.out.println("Tax: " + e.calculateTax());

        System.out.println("Bonus: "
                + e.calculateBonus(10));

        System.out.println("Net Salary: "
                + e.calculateNetSalary());

        System.out.println("--------------------");
    }

    Collections.sort(employees);

    System.out.println("SORTED EMPLOYEES");

    for (Employee e : employees) {
        System.out.println(
            e.getName() + " - " + e.getBaseSalary()
        );
    }
}
}