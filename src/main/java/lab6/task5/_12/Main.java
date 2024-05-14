package lab6.task5._12;
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print("Hello, world!");

        SecurePrinter securePrinter = new SecurePrinter(printer);

        securePrinter.print("SECRET");
    }
}

