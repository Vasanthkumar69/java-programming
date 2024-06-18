import java.util.Scanner;

public class CountLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int lineCount = countLines(input);

        System.out.println("Total number of lines: " + lineCount);
    }

    public static int countLines(String input) {
        String[] lines = input.split("\n");
        return lines.length;
    }
}