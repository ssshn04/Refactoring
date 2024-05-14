package lab6.task3._7;

public class Main {
    public static void main(String[] args) {
        Address realAddress = new Address("123 Holovna St", "Chernivtsi");
        Address nullAddress = null;

        Customer customer1 = new Customer(realAddress);
        Customer customer2 = new Customer(nullAddress);

        System.out.println("Customer 1 Address: " + customer1.getAddress().getStreet() + ", " + customer1.getAddress().getCity());
        System.out.println("Customer 2 Address: " + customer2.getAddress().getStreet() + ", " + customer2.getAddress().getCity());
    }
}
