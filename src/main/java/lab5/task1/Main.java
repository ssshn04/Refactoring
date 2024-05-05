package lab5.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> usernames = new ArrayList<>();
        usernames.add("user1");
        usernames.add("adminUser");
        usernames.add("user2");
        usernames.add("admin123");

        UserListProcessor processor = new UserListProcessor(usernames);
        processor.processUserList();
        System.out.println("Total admins: " + processor.countAdminUsers());

        OrderTracker orderTracker = new OrderTracker();

        orderTracker.updateOrderStatus("order001", "Processing");
        orderTracker.updateOrderStatus("order002", "Shipped");
        System.out.println("Status of order001: " + orderTracker.getOrderStatus("order001"));
        System.out.println("Status of order002: " + orderTracker.getOrderStatus("order002"));

        User user1 = new User("user1", "user1@example.com", "password123", "1234 Street");
        processor.addUser(user1);
        processor.sendEmailToUser(user1);
    }
}