package lab6.task1._5;

public class Department {
    private String name;
    private Employee manager;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Employee getManager() {
        return manager;
    }
}
