package design.pattern.behavioral.visitor;

import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Employee> list = new ArrayList<>();

    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    public void accept(Department department) {
        for (Employee employee : list) {
            employee.accept(department);
        }
    }
}
