package lab6.task2._9;

import java.util.ArrayList;
import java.util.List;

public class Example {
    private static final int NUM_ITEMS = 100;

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        for (int i = 0; i < NUM_ITEMS; i++) {
            items.add("Item " + i);
        }
        System.out.println(items);
    }
}

