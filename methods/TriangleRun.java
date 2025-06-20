package methods;

import java.util.Scanner;

public class TriangleRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 in meters: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 in meters: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 in meters: ");
        double side3 = sc.nextDouble();

        int rounds = calculateRounds(side1, side2, side3);
        System.out.println("The athlete must complete " + rounds + " rounds to complete a 5 km run.");
    }

    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double rounds = 5000 / perimeter;
        return (int) Math.ceil(rounds);
    }
}
