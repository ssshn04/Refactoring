package lab6.task5._6;

public class FloweringPlant extends Plant {
    public FloweringPlant(String name, int age) {
        super(name, age);
    }

    public void blossom() {
        System.out.println(name + " is blossoming...");
    }
}
