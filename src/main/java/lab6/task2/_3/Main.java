package lab6.task2._3;

public class Main {
    public static void main(String[] args) {
        Currency usd = new Currency("USD");
        Currency eur = new Currency("EUR");

        Product laptop = new Product("Laptop", 1000.0, usd);
        Product smartphone = new Product("Smartphone", 500.0, usd);
        Product headphones = new Product("Headphones", 100.0, eur);

        System.out.println("Product: " + laptop.getName() + ", Price: " + laptop.getPrice() + " " + laptop.getCurrency().getCode());
        System.out.println("Product: " + smartphone.getName() + ", Price: " + smartphone.getPrice() + " " + smartphone.getCurrency().getCode());
        System.out.println("Product: " + headphones.getName() + ", Price: " + headphones.getPrice() + " " + headphones.getCurrency().getCode());
    }
}
