package lab6.task5._11;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Dog dog = new Dog();

        Person person = new Person(animal);

        person.interactWithAnimal();

        dog.bark();
    }
}
