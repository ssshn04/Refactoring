package lab6.task5._1;

public class Truck extends Vehicle {
    int loadCapacity;

    public Truck(String color, int loadCapacity) {
        super(color);
        if (loadCapacity <= 0) {
            throw new IllegalArgumentException("Загрузка повинна бути більше 0");
        }
        this.loadCapacity = loadCapacity;
    }
}
