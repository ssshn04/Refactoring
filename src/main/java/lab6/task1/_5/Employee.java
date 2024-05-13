package lab6.task1._5;

public class Employee {
    private String name;
    private Department department;

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    public String getName() {
        return name;
    }

    public String getManagerName() {
        return department.getManager().getName();
    }
}
