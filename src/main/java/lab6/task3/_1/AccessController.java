package lab6.task3._1;

public class AccessController {
    public void checkAccess(User user, Resource resource) {
        if (isAccessAllowed(user, resource)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }

    private boolean isAccessAllowed(User user, Resource resource) {
        return user != null && user.isLoggedIn() && resource != null && user.hasPermission(resource);
    }
}
