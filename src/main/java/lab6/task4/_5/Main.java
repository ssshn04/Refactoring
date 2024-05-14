package lab6.task4._5;
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int num = 5;
        System.out.println("Square of " + num + ": " + calculator.calculatePower(num, 2));
        System.out.println("Cube of " + num + ": " + calculator.calculatePower(num, 3));
    }
}

