package lab6.task2._2;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("Stacy", 100.0);

        System.out.println("Customer: " + order.getOrderDetails().getCustomer());
        System.out.println("Amount: $" + order.getOrderDetails().getAmount());
    }
}
