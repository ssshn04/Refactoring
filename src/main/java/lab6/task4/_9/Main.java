package lab6.task4._9;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        User user = new User("Vicky", 18, "v@gmail.com");

        userManager.createUser(user);
    }
}

