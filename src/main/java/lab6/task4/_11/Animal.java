package lab6.task4._11;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    private void makeSound() {
        System.out.println(name + " makes a sound");
    }

    public void printDetails() {
        makeSound();
        System.out.println(name + " is an animal");
    }
}
