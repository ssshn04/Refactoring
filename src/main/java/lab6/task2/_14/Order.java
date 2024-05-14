package lab6.task2._14;

public class Order {
    private OrderState state;

    public Order() {
        this.state = new NewOrderState();
    }

    public void processOrder() {
        state.processOrder(this);
    }

    public void cancelOrder() {
        state.cancelOrder(this);
    }

    public void completeOrder() {
        state.completeOrder(this);
    }

    public void setState(OrderState state) {
        this.state = state;
    }
}
