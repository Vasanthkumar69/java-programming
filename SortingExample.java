import java.util.Arrays;

public class SortingExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 4, 1};
        sortArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }
}
