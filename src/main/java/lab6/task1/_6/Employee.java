package lab6.task1._6;

public class Employee {
    private String name;
    private Department department;

    public String getName() {
        return name;
    }

    public Employee(String name) {
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }
}

