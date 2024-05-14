package lab6.task5._8;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Square square = new Square(4);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());
    }
}
