package lab5.task2;

public class LargeClassMain {
    public static void main(String[] args) {
        LargeClass person = new LargeClass("Viktoriia", 18, "Female");

        person.relationships.addFriend("Amina");
        person.relationships.addFriend("Stacy");

        person.relationships.addEnemy("Exams :)");

        person.tasks.addTask("Complete project");
        person.tasks.addTask("Find a job");

        person.relationships.removeFriend("Stacy");

        person.tasks.removeTask("Find a job");

        person.displayInfo();
    }
}
