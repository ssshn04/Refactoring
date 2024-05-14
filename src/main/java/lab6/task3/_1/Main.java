package lab6.task3._1;

public class Main {
    public static void main(String[] args) {
        User user = new User(true);
        Resource resource = new Resource();

        AccessController accessController = new AccessController();
        accessController.checkAccess(user, resource);
    }
}
