package lab6.task2._5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Porsche", 200000, 2020);
        Car car2 = new Car("Lamborghini", 2500000, 2023);
        Car car3 = new Car("Ford", 18000, 2018);

        CarData carData = new CarData();
        carData.addCar(car1);
        carData.addCar(car2);
        carData.addCar(car3);

        List<Car> cars = carData.getCars();
        for (Car car : cars) {
            System.out.println("Car: " + car.getName() + ", Price: $" + car.getPrice() + ", Year: " + car.getYear());
        }
    }
}

