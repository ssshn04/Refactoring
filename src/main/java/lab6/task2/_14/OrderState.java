package lab6.task2._14;

interface OrderState {
    void processOrder(Order order);
    void cancelOrder(Order order);
    void completeOrder(Order order);
}

