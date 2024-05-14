package lab6.task5._5;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mercedes");
        System.out.println("Car model: " + car.getModel());

        Truck truck = new Truck("Volvo");
        System.out.println("Truck model: " + truck.getBrand());
    }
}
