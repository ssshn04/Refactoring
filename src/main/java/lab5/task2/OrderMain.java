package lab5.task2;

import java.util.Arrays;
import java.util.List;

public class OrderMain {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Apple", "Banana", "Cherry");

        PriceManager pricingService = new PriceManager();

        Order order = new Order("John Doe", items, pricingService);

        order.processOrder();

        System.out.println("Total price of the order: " + order.getTotalPrice());
    }
}
