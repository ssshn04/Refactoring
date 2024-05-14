package lab6.task4._5;

public class Calculator {
    public int calculatePower(int num, int power) {
        if (power < 1) {
            throw new IllegalArgumentException("Power must be greater than or equal to 1");
        }
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= num;
        }
        return result;
    }
}
