package lab6.task3._1;
public class User {
    private boolean loggedIn;

    public User(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public boolean hasPermission(Resource resource) {
        // Логіка перевірки дозволу на ресурс
        return true;
    }
}

