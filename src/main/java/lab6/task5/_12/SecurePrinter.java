package lab6.task5._12;

public class SecurePrinter implements Print {
    private final Print printer;

    public SecurePrinter(Print printer) {
        this.printer = printer;
    }

    @Override
    public void print(String document) {
        System.out.println("Printing securely: " + document);
        printer.print(document);
    }
}
