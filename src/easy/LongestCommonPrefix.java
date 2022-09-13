package easy;

import java.util.Arrays;
import java.util.Optional;

public class LongestCommonPrefix {

    // https://leetcode.com/problems/longest-common-prefix/
    public static void main(String[] args) {
        String[] words = new String[] { "flower","flow","flight" };
        System.out.println(longestCommonPrefix(words));
        String[] words2 = new String[] { "dog","racecar","car" };
        System.out.println(longestCommonPrefix(words2));
        String[] words3 = new String[] { "ab","a" };
        System.out.println(longestCommonPrefix(words3));
        String[] words4 = new String[] { "reflower","flow", "flight" };
        System.out.println(longestCommonPrefix(words4));
        String[] words5 = new String[] { "a","b" };
        System.out.println(longestCommonPrefix(words5));
        String[] words6 = new String[] { "cir","car" };
        System.out.println(longestCommonPrefix(words6));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        Optional<String> emptyValue = Arrays.stream(strs)
                .filter(s -> s.isEmpty() || s.isBlank())
                .findAny();
        if (emptyValue.isPresent()) return "";
        String resultStr = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String tempStr = strs[i];
            for (int j = strs[i].length() - 1; j >= 0; j--) {
                if (resultStr.startsWith(tempStr)) {
                    resultStr = tempStr;
                    break;
                } else {
                    tempStr = tempStr.substring(0, tempStr.length() - 1);
                    if (tempStr.length() == 0) {
                        resultStr = "";
                    }
                }
            }
        }
        return resultStr;
    }
}