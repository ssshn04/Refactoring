package lab6.task1._5;

public class Main {
    public static void main(String[] args) {

        Employee manager = new Employee();
        manager.setName("Manager 1");

        Department department = new Department();
        department.setManager(manager);

        Employee employee = new Employee();
        employee.setDepartment(department);

        System.out.println("Manager's name: " + employee.getManagerName());
    }
}

