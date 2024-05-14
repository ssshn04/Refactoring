package lab6.task2._13;

public class Type2Product extends Product {
    public Type2Product(String name) {
        super(name);
    }

    @Override
    public void process() {
        System.out.println("Processing Type 2 Product: " + getName());
    }
}
