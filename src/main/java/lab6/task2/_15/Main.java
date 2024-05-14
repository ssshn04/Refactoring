package lab6.task2._15;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(3.0, 4.0);
        System.out.println("Rectangle width: " + rectangle.getWidth());
        System.out.println("Rectangle height: " + rectangle.getHeight());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
    }
}
