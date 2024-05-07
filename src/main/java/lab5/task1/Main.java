package lab5.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("user1", "user1@gmail.com", "123", "Address 1");
        User admin1 = new User("adminUser", "usAd@gmail.com", "12555", "Address 2");
        User user2 = new User("user2", "user2@gmail.com", "321", "Address 3");
        User admin123 = new User("admin123", "userAdmin123@gmail.com", "123456", "Address 4");
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(admin1);
        users.add(user2);
        users.add(admin123);

        UserListProcessor processor = new UserListProcessor(users);
        processor.processUserList();
        System.out.println("Total admins: " + processor.countAdminUsers());

        processor.addUser(user1);
        processor.sendEmailToUser(user1);
    }
}