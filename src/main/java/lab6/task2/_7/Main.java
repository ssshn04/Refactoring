package lab6.task2._7;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Danya");

        Course course1 = new Course("Java Programming");

        student1.enrollCourse(course1);
        List<Student> studentsInCourse = course1.getStudents();
        System.out.println("Students in " + course1.getTitle() + ":");
        for (Student student : studentsInCourse) {
            System.out.println(student.getName());
        }
    }
}
