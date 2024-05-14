package lab6.task2._13;

public class Type1Product extends Product {
    public Type1Product(String name) {
        super(name);
    }

    @Override
    public void process() {
        System.out.println("Processing Type 1 Product: " + getName());
    }
}
