package lab6.task4._7;
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Danil", 30, "123 Holovna St");
        ProcessPerson processor = new ProcessPerson();

        processor.process(person);
    }
}

