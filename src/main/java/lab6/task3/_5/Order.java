package lab6.task3._5;
public class Order {
    private int quantity;
    private double price;

    public Order(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public void processOrder() {
        if (quantity <= 0) {
            System.out.println("Invalid quantity");
            return;
        }

        if (price <= 0) {
            System.out.println("Invalid price");
            return;
        }

        System.out.println("Order processed successfully");
    }
}

