import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three space-separated integers
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int l = scanner.nextInt();

        // Find the smallest using nested ternary operator
        int smallest = (n <= m) ? ((n <= l) ? n : l) : ((m <= l) ? m : l);

        System.out.println(smallest);
    }
}
