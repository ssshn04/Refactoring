package lab6.task5._3;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Lexus", 3, "Bolonka");
        Cat cat = new Cat("Murka", 2, "White");

        System.out.println("Dog: " + dog.name + ", Age: " + dog.age + ", Breed: " + dog.breed);
        System.out.println("Cat: " + cat.name + ", Age: " + cat.age + ", Color: " + cat.color);
    }
}
