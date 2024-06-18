import java.util.Scanner;

public class DayConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();

        int weeks = days / 7;
        int remainingDays = days % 7;

        System.out.println(days + " days is equal to:");
        System.out.println(weeks + " weeks and " + remainingDays + " days");
    }
}