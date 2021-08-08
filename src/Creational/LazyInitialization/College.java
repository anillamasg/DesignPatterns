package Creational.LazyInitialization;

import java.util.ArrayList;
import java.util.List;

public class College {
    private String name;
    // Lazy Instantiation not implemented.
    // private List<Department> departments = new ArrayList<>(){{add(Department.SCIENCE); add(Department.HUMANITIES); add(Department.MANAGEMENT); }};
    private List<Department> departments;

    public College(String name){
        this.name = name;
    }

    public void setDepartments(){
        if (departments == null)
            departments = new ArrayList<>(){{add(Department.SCIENCE); add(Department.HUMANITIES); add(Department.MANAGEMENT); }};
    }

    @Override
    public String toString() {
        setDepartments(); // Lazy Instantiation implemented.
        return "College{" +
                "name='" + name + '\'' +
                ", departments=" + departments.toString() +
                '}';
    }
}
