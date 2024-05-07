package lab5.task1;

import java.util.ArrayList;
import java.util.List;

public class UserListProcessor {
    private final List<User> users;
    public UserListProcessor(ArrayList<User> users) {
        this.users = users;
    }
    public void processUserList() {
        for (User user : users) {
            System.out.println("Processing user: " + user.getUsername());
            adminDetector(user);
        }
    }

    private void adminDetector(User user) {
        if (user.isAdmin()) {
            System.out.println("Admin user detected!");
        }
    }

    public long countAdminUsers() {
        return users.stream().filter(User::isAdmin).count();
    }

    public void addUser(User user) {
        System.out.println("Adding user: " + user.getUsername());
        users.add(user);
    }

    public void sendEmailToUser(User user) {
        System.out.println("Sending email to " + user.getEmail());
    }
}
