
package com.mycompany.payrollsystem;
import java.time.LocalDate;

public class Contractor extends Employee {

private int hourlyRate;
private int hoursWorked;

public Contractor(String id, String name,
                  LocalDate joinDate,
                  int hourlyRate,
                  int hoursWorked) {

    super(id, name, hourlyRate * hoursWorked, joinDate);

    this.hourlyRate = hourlyRate;
    this.hoursWorked = hoursWorked;
}

@Override
public double calculateNetSalary() {
    return baseSalary - calculateTax();
}

@Override
public double calculateBonus(double performanceScore) {
    return super.calculateBonus(performanceScore);
}
}