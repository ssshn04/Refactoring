package lab6.task5._9;
public class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println("The " + species + " is eating.");
    }

    public void sleep() {
        System.out.println("The " + species + " is sleeping.");
    }

    public void bark() {
        System.out.println("The " + species + " is barking.");
    }
}

