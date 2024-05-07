package lab5.task2;

import java.util.List;

public class Order {
    private String customerName;
    private List<Item> items;
    private double totalPrice;
    private PriceManager priceManager;
    public Order(String customerName, List<Item> items, PriceManager priceManager) {
        this.customerName = customerName;
        this.items = items;
        this.priceManager = priceManager;
        this.totalPrice = priceManager.calculateTotalPrice(items);
    }
    public void processOrder() {
        validateItems();
        prepareShipment();
        notifyCustomer();
    }

    private void validateItems() {
        System.out.println("Validating items...");
    }

    private void prepareShipment() {
        System.out.println("Preparing shipment...");
    }

    private void notifyCustomer() {
        System.out.println("Notifying customer...");
    }
    public double getTotalPrice() {
        return totalPrice;
    }
}
