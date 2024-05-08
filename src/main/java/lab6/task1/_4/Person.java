package lab6.task1._4;

public class Person {
    private String name;
    private String street;
    private String city;
    private String country;

    public Person(String name, String street, String city, String country) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public void printAddress() {
        System.out.println("Meet " + name + "!");
        System.out.println("Address: " + street + ", " + city + ", " + country);
    }
}
