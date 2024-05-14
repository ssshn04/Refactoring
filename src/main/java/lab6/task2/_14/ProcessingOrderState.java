package lab6.task2._14;

public class ProcessingOrderState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Order is already being processed.");
    }

    @Override
    public void cancelOrder(Order order) {
        order.setState(new CancelledOrderState());
        System.out.println("Order is cancelled.");
    }

    @Override
    public void completeOrder(Order order) {
        order.setState(new CompletedOrderState());
        System.out.println("Order is completed.");
    }
}
