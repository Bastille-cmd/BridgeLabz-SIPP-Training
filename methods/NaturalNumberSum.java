package methods;

import java.util.*;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a natural number");
            return;
        }

        int sumRecursive = recursiveSum(n);
        int sumFormula = formulaSum(n);

        System.out.println("Recursive sum: " + sumRecursive);
        System.out.println("Formula sum: " + sumFormula);

        if (sumRecursive == sumFormula) {
            System.out.println("Both results match");
        } else {
            System.out.println("Mismatch in results");
        }
    }

    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }
}
