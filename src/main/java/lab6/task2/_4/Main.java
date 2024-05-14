package lab6.task2._4;

public class Main {
    public static void main(String[] args) {
        ImmutablePoint point = new ImmutablePoint(10, 20);

        System.out.println("X coordinate: " + point.getX());
        System.out.println("Y coordinate: " + point.getY());

        ImmutablePoint samePoint = new ImmutablePoint(10, 20);
        System.out.println("Are points equal? " + point.equals(samePoint));
    }
}
