package methods;

import java.util.*;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int digitCount = getDigitCount(number);
        int[] digits = getDigits(number, digitCount);

        System.out.println("Digit Count: " + digitCount);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrongNumber(digits, number));
        
        int[] largestTwo = getTwoLargest(digits);
        System.out.println("Largest: " + largestTwo[0] + ", Second Largest: " + largestTwo[1]);

        int[] smallestTwo = getTwoSmallest(digits);
        System.out.println("Smallest: " + smallestTwo[0] + ", Second Smallest: " + smallestTwo[1]);
    }

    public static int getDigitCount(int num) {
        int count = 0;
        int temp = num;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static int[] getDigits(int num, int count) {
        int[] arr = new int[count];
        int i = count - 1;
        while (num > 0) {
            arr[i--] = num % 10;
            num /= 10;
        }
        return arr;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int[] digits, int original) {
        int sum = 0;
        int power = digits.length;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == original;
    }

    public static int[] getTwoLargest(int[] digits) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max) {
                second = max;
                max = d;
            } else if (d > second && d != max) {
                second = d;
            }
        }
        return new int[]{max, second};
    }

    public static int[] getTwoSmallest(int[] digits) {
        int min = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min) {
                second = min;
                min = d;
            } else if (d < second && d != min) {
                second = d;
            }
        }
        return new int[]{min, second};
    }
}
