package lab6.task2._15;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super(Math.PI * radius * radius, 2 * Math.PI * radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
