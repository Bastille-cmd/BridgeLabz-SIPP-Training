package methods;

import java.util.*;

public class OTPGenerator {
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs: " + Arrays.toString(otps));

        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique");
        } else {
            System.out.println("Some OTPs are repeated");
        }
    }

    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    public static boolean areOTPsUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) return false;
        }
        return true;
    }
}
