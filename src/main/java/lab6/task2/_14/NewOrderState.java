package lab6.task2._14;

public class NewOrderState implements OrderState {
    @Override
    public void processOrder(Order order) {
        order.setState(new ProcessingOrderState());
        System.out.println("Order is now being processed.");
    }

    @Override
    public void cancelOrder(Order order) {
        order.setState(new CancelledOrderState());
        System.out.println("Order is cancelled.");
    }

    @Override
    public void completeOrder(Order order) {
        System.out.println("Order cannot be completed as it is not yet processed.");
    }
}

