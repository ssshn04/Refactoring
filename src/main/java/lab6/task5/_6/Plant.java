package lab6.task5._6;
abstract class Plant {
    String name;
    int age;

    public Plant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void grow() {
        System.out.println(name + " is growing...");
    }
}

