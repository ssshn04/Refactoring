package lab6.task4._8;

public class Processor {
    private Calculator calculator;

    public Processor(Calculator calculator) {
        this.calculator = calculator;
    }

    public void process() {
        int x = 10;
        int y = 20;

        int result = calculator.add(x, y);

        System.out.println("Result: " + result);
    }
}
