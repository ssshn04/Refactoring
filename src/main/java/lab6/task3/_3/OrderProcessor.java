package lab6.task3._3;

public class OrderProcessor {
    public void processOrder(int quantity, double price) {
        if (quantity > 10 || price > 100) {
            applyDiscount();
        } else {
            System.out.println("Discount is not applied");
        }
    }

    private void applyDiscount() {
        System.out.println("Discount applied");
        // Логіка застосування знижки
    }
}

