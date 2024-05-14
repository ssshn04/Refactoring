package lab6.task4._12;

public class CarFactory {
    public Car createCar(String brand, String model, int year, String color) {
        return new Car(brand, model, year, color);
    }
}
