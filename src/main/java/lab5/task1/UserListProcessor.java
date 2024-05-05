package lab5.task1;

import java.util.ArrayList;
import java.util.List;

public class UserListProcessor {
    private ArrayList<String> usernames;
    private List<User> users = new ArrayList<>();
    public UserListProcessor(ArrayList<String> usernames) {
        this.usernames = usernames;
    }
    public void processUserList() {
        for (String username : usernames) {
            System.out.println("Processing user: " + username);
            adminDetector(username);
        }
    }

    private void adminDetector(String username) {
        if (username.contains("admin")) {
            System.out.println("Admin user detected!");
        }
    }

    public int countAdminUsers() {
        return (int) usernames.stream().filter(u -> u.contains("admin")).count();
    }

    public void addUser(User user) {
        System.out.println("Adding user: " + user.getUsername());
        users.add(user);
    }

    public void sendEmailToUser(User user) {
        System.out.println("Sending email to " + user.getEmail());
    }
}
