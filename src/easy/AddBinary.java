package easy;

import java.math.BigInteger;

public class AddBinary {

    // https://leetcode.com/problems/add-binary/
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        BigInteger number0 = new BigInteger(a, 2);
        BigInteger number1 = new BigInteger(b, 2);

        return number0.add(number1).toString(2);
    }
}
