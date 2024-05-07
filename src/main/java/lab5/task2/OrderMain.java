package lab5.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderMain {
    public static void main(String[] args) {
        Item apple = new Item("Apple", 30.00, 2);
        Item tomato = new Item("Tomato", 80.00, 7);
        Item cucumber = new Item("Cucumber", 60.00,5);

        List<Item> items = new ArrayList<>();

        items.add(apple);
        items.add(tomato);
        items.add(cucumber);

        PriceManager pricingService = new PriceManager();

        Order order = new Order("Viktoriia", items, pricingService);

        order.processOrder();

        System.out.println("Total price of the order: " + order.getTotalPrice());
    }
}
