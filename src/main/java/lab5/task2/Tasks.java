package lab5.task2;

import java.util.ArrayList;
import java.util.List;

public class Tasks {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }
    public void removeTask(String task) {
        tasks.remove(task);
    }

    List<String> getTasks() { return tasks; }
}
