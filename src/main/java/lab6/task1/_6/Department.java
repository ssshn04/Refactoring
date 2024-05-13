package lab6.task1._6;

public class Department {
    private String name;
    private Employee manager;

    public Department(String name) {
        this.name = name;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public String getManagerName() {
        return manager.getName();
    }
}

