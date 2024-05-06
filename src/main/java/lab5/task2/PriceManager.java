package lab5.task2;

import java.util.List;

public class PriceManager {
    public double calculateTotalPrice(List<String> items) {
        double price = 0.0;
        for (String item : items) {
            price += getPriceForItem(item);
        }
        return price;
    }

    private double getPriceForItem(String item) {
        return 200.00;
    }
}
