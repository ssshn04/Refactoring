package lab6.task1._6;

public class Main {
    public static void main(String[] args) {

        Department department = new Department("Engineering");

        Employee manager = new Employee("Emma");
        department.setManager(manager);

        Employee employee = new Employee("Dima");
        employee.setDepartment(department);

        String managerName = employee.getDepartment().getManagerName();
        System.out.println("Manager name: " + managerName);
    }
}
