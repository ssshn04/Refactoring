package lab5.task2;

import java.util.List;

public class PriceManager {
    public double calculateTotalPrice(List<Item> items) {
        double price = 0.0;
        for (Item item : items) {
            price += getPriceForItem(item)*item.getQuantity();
        }
        return price;
    }

    private double getPriceForItem(Item item) {
        return item.getPrice();
    }
}
