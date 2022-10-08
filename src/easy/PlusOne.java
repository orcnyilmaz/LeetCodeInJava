package easy;

import java.util.Arrays;

public class PlusOne {

    // https://leetcode.com/problems/plus-one/
    public static void main(String[] args) {
        int[] digits = new int[] {1,2,3};
        System.out.println(Arrays.toString(plusOne(digits))); // 124

        int[] digits2 = new int[] {8,7,9};
        System.out.println(Arrays.toString(plusOne(digits2))); // 880

        int[] digits3 = new int[] {9,9,9};
        System.out.println(Arrays.toString(plusOne(digits3))); // 1000

        int[] digits4 = new int[] {9};
        System.out.println(Arrays.toString(plusOne(digits4))); // 10
    }

    public static int[] plusOne(int[] digits) {
        int carry = 0;

        if (digits[digits.length - 1] == 9) {
            if (digits.length == 1) {
                return new int[] {1,0};
            }
            digits[digits.length - 1] = 0;
            carry++;
        } else {
            digits[digits.length - 1]++;
        }

        for (int i = digits.length - 2; i >= 0; i--) {
            if (carry > 0) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i]++;
                    carry = 0;
                }
            }

            if (i == 0 && carry > 0) {
                int[] resultArray = new int[digits.length + 1];
                System.arraycopy(digits, 0, resultArray, 1, digits.length - 1);
                resultArray[0] = 1;

                return resultArray;
            }
        }

        return digits;
    }
}
