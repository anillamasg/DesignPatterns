package Structural.Composite;

public class EmployeeSalary implements Salary  {
    private final int salary = 100;

    @Override
    public int getTotalSalary() {
        return salary;
    }
}
