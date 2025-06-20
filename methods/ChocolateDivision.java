package methods;

import java.util.Scanner;

public class ChocolateDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] output = new int[2];
        output[0] = number / divisor;
        output[1] = number % divisor;
        return output;
    }
}
