package lab6.task5._7;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Hanna", 50000);
        Manager manager = new Manager("Vicky", 70000, "Sales");

        System.out.println("Employee Details:");
        employee.displayDetails();

        System.out.println("\nManager Details:");
        manager.displayDetails();
    }
}
