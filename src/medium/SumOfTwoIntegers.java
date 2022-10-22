package medium;

public class SumOfTwoIntegers {

    // https://leetcode.com/problems/sum-of-two-integers/
    public static void main(String[] args) {
        System.out.println(getSum(1,2));
        System.out.println(getSum(2,3));
        System.out.println(getSum(-12,-8));
    }

    public static int getSum(int a, int b) {
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                a++;
            }
        } else {
            for (int i = 0; i < -(b); i++) {
                a--;
            }
        }

        return a;
    }
}
