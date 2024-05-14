package lab6.task2._12;

public class Product {
    private ProductType type;
    private String name;

    public Product(ProductType type, String name) {
        this.type = type;
        this.name = name;
    }

    public ProductType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ProductType type = new ProductType(1, "Electronics");

        Product product = new Product(type, "Smartphone");

        System.out.println("Product: " + product.getName() + ", Type: " + product.getType().getDescription());
    }
}

