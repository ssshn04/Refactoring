package lab6.task1._2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Nick");
        Employee emp2 = new Employee("Bob");
        Employee emp3 = new Employee("Stacy");
        Employee emp4 = new Employee("Raven");

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        Company company = new Company(employees, 200.00);
        company.printEmployeeSalaries();

    }
}
