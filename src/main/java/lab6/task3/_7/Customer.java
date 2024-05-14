package lab6.task3._7;

public class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        if (address == null) {
            return new NullAddress();
        }
        return address;
    }
}
