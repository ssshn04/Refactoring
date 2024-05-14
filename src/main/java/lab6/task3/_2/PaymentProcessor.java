package lab6.task3._2;

public class PaymentProcessor {
    public void processPayment(double amount, boolean isMember, boolean isDiscountAvailable) {
        if ((amount > 100 && isMember) || (amount > 200 && isDiscountAvailable)) {
            applyDiscount();
        }
    }

    private void applyDiscount() {
        System.out.println("Discount applied");
        // Логіка застосування знижки
    }
}

