package lab6.task1._6;

public class Employee {
    private String name;
    private Department department;

    public String getName() {
        return name;
    }

    public String getDepartmentManagerName() {
        return department.getManagerName();
    }
}

