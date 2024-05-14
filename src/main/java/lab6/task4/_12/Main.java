package lab6.task4._12;
public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.createCar("Toyota", "Camry", 2022, "blue");

        car.drive();
        System.out.println(car);
    }
}

