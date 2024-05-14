package lab6.task5._1;
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Red", "Porsche");
        System.out.println("Car color: " + car.color);
        System.out.println("Car model: " + car.model);

        try {
            Truck truck = new Truck("Blue", -100);
            System.out.println("Truck color: " + truck.color);
            System.out.println("Truck load capacity: " + truck.loadCapacity);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

