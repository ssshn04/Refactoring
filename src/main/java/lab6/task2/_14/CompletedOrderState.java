package lab6.task2._14;

public class CompletedOrderState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Order is already completed.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Completed order cannot be cancelled.");
    }

    @Override
    public void completeOrder(Order order) {
        System.out.println("Order is already completed.");
    }
}
