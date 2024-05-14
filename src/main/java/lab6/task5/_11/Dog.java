package lab6.task5._11;

public class Dog {
    private final Animal animal;

    public Dog() {
        this.animal = new Animal();
    }

    void bark() {
        System.out.println("Dog is barking");
    }

    void eat() {
        animal.eat();
    }

    void sleep() {
        animal.sleep();
    }
}
