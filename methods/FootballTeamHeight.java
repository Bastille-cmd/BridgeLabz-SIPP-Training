package methods;

import java.util.*;

public class FootballTeamHeight {
    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }

        int sum = getSum(heights);
        double mean = getMean(sum, heights.length);
        int shortest = getShortest(heights);
        int tallest = getTallest(heights);

        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Shortest: " + shortest);
        System.out.println("Tallest: " + tallest);
        System.out.println("Mean: " + mean);
    }

    public static int getSum(int[] arr) {
        int total = 0;
        for (int n : arr) total += n;
        return total;
    }

    public static double getMean(int sum, int count) {
        return sum / (double) count;
    }

    public static int getShortest(int[] arr) {
        int min = arr[0];
        for (int n : arr) if (n < min) min = n;
        return min;
    }

    public static int getTallest(int[] arr) {
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }
}
