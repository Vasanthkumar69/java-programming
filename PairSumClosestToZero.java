import java.util.Arrays;

public class PairSumClosestToZero {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 1, -4};
        int n = arr.length;
        int sum = 0;
        int minDiff = Integer.MAX_VALUE;
        int diff = 0;
        int first = 0;
        int second = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = arr[i] + arr[j];
                diff = Math.abs(sum);
                if (diff < minDiff) {
                    minDiff = diff;
                    first = arr[i];
                    second = arr[j];
                }
            }
        }

        System.out.println("The pair of elements whose sum is closest to zero is (" + first + ", " + second + ")");
    }
}