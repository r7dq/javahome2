
package com.mycompany.payrollsystem;
import java.time.LocalDate;

public class FullTime extends Employee {

private double allowance;

public FullTime(String id, String name,
                double baseSalary,
                LocalDate joinDate,
                double allowance) {

    super(id, name, baseSalary, joinDate);
    this.allowance = allowance;
}

@Override
public double calculateNetSalary() {
    return baseSalary + allowance - calculateTax();
}

@Override
public double calculateBonus(double performanceScore) {
    return super.calculateBonus(performanceScore);
}
}