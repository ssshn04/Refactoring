package lab6.task3._4;
public class ArraySearch {
    public void searchElement(int[] array, int target) {
        for (int j : array) {
            if (j == target) {
                System.out.println("Element found");
                return;
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        ArraySearch searcher = new ArraySearch();
        int[] array = {1, 2, 3, 4, 5};

        searcher.searchElement(array, 3);
        searcher.searchElement(array, 6);
    }
}

