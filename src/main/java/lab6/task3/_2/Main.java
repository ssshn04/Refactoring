package lab6.task3._2;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment(150, true, false);
        processor.processPayment(250, false, true);
        processor.processPayment(90, true, false);
    }
}
