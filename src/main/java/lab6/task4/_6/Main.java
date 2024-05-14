package lab6.task4._6;
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        String textDocument = "Sample text document";
        String imageDocument = "Sample image document";

        printer.printTextDocument(textDocument);
        printer.printImageDocument(imageDocument);
    }
}

