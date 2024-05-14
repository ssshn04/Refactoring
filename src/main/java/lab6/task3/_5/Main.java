package lab6.task3._5;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Joseph", "jo@example.com");

        Order order = new Order(5, 50.0);
        order.processOrder();
    }
}
