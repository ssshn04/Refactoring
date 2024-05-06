package lab5.task2;

import java.util.ArrayList;
import java.util.List;

public class LargeClass {
    private String name;
    private int age;
    private String gender;
    public Relationships relationships;
    public Tasks tasks;

    public LargeClass(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.relationships = new Relationships();
        this.tasks = new Tasks();
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Friends: " + relationships.getFriends());
        System.out.println("Enemies: " + relationships.getEnemies());
        System.out.println("Tasks: " + tasks.getTasks());
    }
}
