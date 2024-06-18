import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(array));

        int[] newArray = new int[array.length];
        newArray[0] = array[array.length - 1];
        newArray[array.length - 1] = array[0];

        for (int i = 1; i < array.length - 1; i++) {
            newArray[i] = array[i];
        }

        System.out.println("New array after swapping the first and last elements: " + Arrays.toString(newArray));
    }
}