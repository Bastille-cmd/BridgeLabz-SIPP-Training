package methods;

import java.util.*;

public class FactorTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] factors = getFactors(number);
        int greatest = getGreatest(factors);
        int sum = getSum(factors);
        int product = getProduct(factors);
        double cubeProduct = getCubeProduct(factors);

        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest: " + greatest);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Product of Cubes: " + cubeProduct);
    }

    public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        int[] arr = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) arr[index++] = i;
        }
        return arr;
    }

    public static int getGreatest(int[] arr) {
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }

    public static int getSum(int[] arr) {
        int total = 0;
        for (int n : arr) total += n;
        return total;
    }

    public static int getProduct(int[] arr) {
        int prod = 1;
        for (int n : arr) prod *= n;
        return prod;
    }

    public static double getCubeProduct(int[] arr) {
        double prod = 1;
        for (int n : arr) prod *= Math.pow(n, 3);
        return prod;
    }
}

