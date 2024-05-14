package lab6.task4._2;
public class Main {
    public static void main(String[] args) {
        double price = 10.0;
        int quantity = 5;
        double taxRate = 0.2;
        double total = calculateTotal(price, quantity, taxRate);
        System.out.println("Total: " + total);
    }

    public static double calculateTotal(double price, int quantity, double taxRate) {
        double subtotal = price * quantity;
        double tax = subtotal * taxRate;
        return subtotal + tax;
    }
}

