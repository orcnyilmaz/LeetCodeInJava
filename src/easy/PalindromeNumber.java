package easy;

public class PalindromeNumber {

    // https://leetcode.com/problems/palindrome-number/
    public static void main(String[] args) {
        int pal1 = 121;
        System.out.println(isPalindrome(pal1));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int tempNum = x;
        int reversedNum = 0;
        int carry = tempNum % 10;

        while(tempNum != 0) {
            reversedNum = (reversedNum * 10) + carry;
            tempNum = tempNum / 10;
            carry = tempNum % 10;
        }

        return reversedNum == x;
    }
}
