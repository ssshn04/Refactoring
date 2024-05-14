package lab6.task2._8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Vicky"));
        employees.add(new Employee("Nick"));

        Department department = new Department("IT", employees);

        System.out.println("Department name: " + department.getName());
        System.out.println("Employees in department:");
        for (Employee employee : department.getEmployees()) {
            System.out.println("- " + employee.getName());
        }
    }
}

