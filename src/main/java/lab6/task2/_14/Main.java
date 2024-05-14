package lab6.task2._14;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.processOrder();
        order.completeOrder();

        order.processOrder();
        order.completeOrder();

        order.cancelOrder();

        order.processOrder();
        order.completeOrder();
    }
}
