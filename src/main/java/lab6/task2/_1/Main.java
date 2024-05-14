package lab6.task2._1;

import lab6.task2._1.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Dima");
        employee.setSalary(3000);

        System.out.println("Before raise:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: $" + employee.getSalary());

        employee.raiseSalary(500);

        System.out.println("\nAfter raise:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: $" + employee.getSalary());
    }
}
