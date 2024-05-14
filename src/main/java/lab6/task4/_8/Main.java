package lab6.task4._8;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Processor processor = new Processor(calculator);

        processor.process();
    }
}

