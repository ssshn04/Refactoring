package lab6.task3._7;

public class NullAddress extends Address {
    public NullAddress() {
        super("Unknown", "Unknown");
    }

    @Override
    public String getStreet() {
        return super.getStreet();
    }

    @Override
    public String getCity() {
        return super.getCity();
    }
}
