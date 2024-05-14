package lab6.task2._14;

public class CancelledOrderState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Cancelled order cannot be processed.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order is already cancelled.");
    }

    @Override
    public void completeOrder(Order order) {
        System.out.println("Cancelled order cannot be completed.");
    }
}
