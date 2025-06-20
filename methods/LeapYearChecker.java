package methods;

import java.util.*;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println();
            return;
        }

        if (isLeapYear(year)) {
            System.out.println(year);
        } else {
            System.out.println(year);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
