package lab6.task1._8;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Current date: " + currentDate);

        Date futureDate = DateHelper.addDays(currentDate, 5);
        System.out.println("Date after adding 5 days: " + futureDate);
    }
}

