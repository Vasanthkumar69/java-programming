

public class FactorPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextint();

        int factorCount = countFactors(num);
        System.out.println("Number of factors: " + factorCount);

        System.out.print("Enter the nth factor to print: ");
        int n = scanner.nextInt();
        int nthFactor = getNthFactor(num, n);
        System.out.println("The " + n + "th factor is: " + nthFactor);
    }

    public static int countFactors(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                if (i * i != num) {
                    count++; // count the other factor as well
                }
            }
        }
        return count;
    }

    public static int getNthFactor(int num, int n) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                if (count == n) {
                    return i;
                }
                if (i * i != num) {
                    count++; // count the other factor as well
                    if (count == n) {
                        return num / i;
                    }
                }
            }
        }
        return -1; // return -1 if nth factor does not exist
    }
}