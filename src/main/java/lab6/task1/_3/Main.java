package lab6.task1._3;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Nick", "dep1", 5000.00);
        Employee emp2 = new Employee("Bob", "dep2", 30000.00);
        Employee emp3 = new Employee("Stacy", "dep3", 40000.00);
        Employee emp4 = new Employee("Raven", "dep4", 10000.00);

        List<Employee> employees = new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        EmployeePrinter employeePrinter = new EmployeePrinter(employees);
        employeePrinter.printEmployeeDetails(employees);
    }
}
