package methods;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            double weight = sc.nextDouble();
            double height = sc.nextDouble();
            data[i][0] = weight;
            data[i][1] = height;
        }

        calculateBMI(data);
        status = getStatus(data);

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + data[i][0]);
            System.out.println("Height: " + data[i][1]);
            System.out.println("BMI: " + data[i][2]);
            System.out.println("Status: " + status[i]);
            System.out.println();
        }
    }

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightInMeters = data[i][1] / 100.0;
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
        }
    }

    public static String[] getStatus(double[][] data) {
        String[] result = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) result[i] = "Underweight";
            else if (bmi < 25) result[i] = "Normal";
            else if (bmi < 30) result[i] = "Overweight";
            else result[i] = "Obese";
        }
        return result;
    }
}
