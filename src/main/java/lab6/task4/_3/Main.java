package lab6.task4._3;

public class Main {
    public static void main(String[] args) {
        double price = 10.0;
        int quantity = 5;
        double total = calculateTotal(price, quantity);
        System.out.println("Total: " + total);
    }

    public static double calculateTotal(double price, int quantity) {
        return price * quantity;
    }
}

