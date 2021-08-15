package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeSalary implements Salary{
    private List<Salary> employeeSalaryList;

    public CompositeSalary(){
        employeeSalaryList = new ArrayList<>();
    }

    @Override
    public int getTotalSalary() {
        int total = 0;

        for (Salary salary: employeeSalaryList){
            total +=salary.getTotalSalary();
        }
        return total;
    }

    public void addEmployeeSalary(Salary salary) {
        employeeSalaryList.add(salary);
    }

    public void removeEmployeeSalary(Salary salary) {
        employeeSalaryList.remove(salary);
    }
}
