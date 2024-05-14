package lab6.task2._10;

public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person(25);

        int age = person.getAge();
        System.out.println("Age: " + age);

        person.setAge(30);
        System.out.println("Updated age: " + person.getAge());
    }
}
