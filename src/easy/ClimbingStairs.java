package easy;

public class ClimbingStairs {

    // https://leetcode.com/problems/climbing-stairs/
    public static void main(String[] args) {
        System.out.println(climbStairs(1)); // 1
        System.out.println(climbStairs(2)); // 2 - 1 1
        System.out.println(climbStairs(3)); // 1 1 1 - 2 1 - 1 2
        System.out.println(climbStairs(4)); // 1 1 1 1 - 2 2 - 2 1 1 - 1 2 1 - 2 1 1
        System.out.println(climbStairs(5)); // 1 1 1 1 1 - 2 2 1 - 2 1 2 - 1 2 2 - 1 1 1 2 - 1 2 1 1 - ...
    }

    // returns right answer but time limit exceeds
    // basically fibonacci solutions
    /*
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }*/

    // 0 - 1 - 1 - 2 - 3 - 5 - 8 - 13 - 21...
    /*
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int twoBefore = 1;
        int oneBefore = 2;
        int sum = 0;

        for (int i = 3; i <= n; i++) {
            sum = twoBefore + oneBefore;
            twoBefore = oneBefore;
            oneBefore = sum;
        }

        return sum;
    }*/

    public static int climbStairs(int n) {
        int twoBefore = 0;
        int oneBefore = 1;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = twoBefore + oneBefore;
            twoBefore = oneBefore;
            oneBefore = sum;
        }

        return sum;
    }
}
