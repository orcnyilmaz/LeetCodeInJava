package easy;

public class CheckIfOneStringSwapCanMakeStringsEqual {

    // https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
    public static void main(String[] args) {
        //System.out.println(areAlmostEqual("bank", "kanb")); // true
        //System.out.println(areAlmostEqual("attack", "defend")); // false
        //System.out.println(areAlmostEqual("kelb", "kelb")); // true
        //System.out.println(areAlmostEqual("aa", "ac")); // false
        //System.out.println(areAlmostEqual("caa", "aaz")); //false
        //System.out.println(areAlmostEqual("abca", "abcc")); //false
        //System.out.println(areAlmostEqual("bankb", "kannb")); //false
        System.out.println(areAlmostEqual("bf", "dd")); //false
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        int notEqualCount = 0;
        int s1Sum = 0;
        int s2Sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                s1Sum = s1Sum + s1.charAt(i);
                s2Sum = s2Sum + s2.charAt(i);
                notEqualCount++;

                if (s2.indexOf(s1.charAt(i)) == -1 || s1.indexOf(s2.charAt(i)) == -1) {
                    return false;
                }

                if (notEqualCount > 2) {
                    return false;
                }
            }
        }

        return s1Sum == s2Sum;
    }
}
