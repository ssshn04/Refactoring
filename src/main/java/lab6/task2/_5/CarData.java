package lab6.task2._5;

import java.util.ArrayList;
import java.util.List;

public class CarData {
    private List<Car> cars;

    public CarData() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }
}
