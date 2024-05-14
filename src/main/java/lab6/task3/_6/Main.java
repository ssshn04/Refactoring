package lab6.task3._6;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Area of the circle: " + calculateArea(circle));
        System.out.println("Area of the rectangle: " + calculateArea(rectangle));
    }

    public static double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
