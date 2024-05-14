package lab6.task2._2;

public class Order {
    private OrderDetails orderDetails;

    public Order(String customer, double amount) {
        this.orderDetails = new OrderDetails(customer, amount);
    }

    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }

    // Інші методи класу...
}

