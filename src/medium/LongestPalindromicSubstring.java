package medium;

import java.util.Arrays;

public class LongestPalindromicSubstring {

    // 76 / 140 test cases passed.
    // Time limit exceeded, will return to speed up the algorithm
    // https://leetcode.com/problems/longest-palindromic-substring/
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad")); // bab, aba
        System.out.println(longestPalindrome("cbbd")); // bb
        System.out.println(longestPalindrome("aaaaa")); // aaaaa
        System.out.println(longestPalindrome("")); //
        System.out.println(longestPalindrome("a")); // a
        System.out.println(longestPalindrome("ac")); // a
        System.out.println(longestPalindrome("aacabdkacaa")); // aca
        System.out.println(longestPalindrome("aaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllmmmmmmmmmmnnnnnnnnnnooooooooooppppppppppqqqqqqqqqqrrrrrrrrrrssssssssssttttttttttuuuuuuuuuuvvvvvvvvvvwwwwwwwwwwxxxxxxxxxxyyyyyyyyyyzzzzzzzzzzyyyyyyyyyyxxxxxxxxxxwwwwwwwwwwvvvvvvvvvvuuuuuuuuuuttttttttttssssssssssrrrrrrrrrrqqqqqqqqqqppppppppppoooooooooonnnnnnnnnnmmmmmmmmmmllllllllllkkkkkkkkkkjjjjjjjjjjiiiiiiiiiihhhhhhhhhhggggggggggffffffffffeeeeeeeeeeddddddddddccccccccccbbbbbbbbbbaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllmmmmmmmmmmnnnnnnnnnnooooooooooppppppppppqqqqqqqqqqrrrrrrrrrrssssssssssttttttttttuuuuuuuuuuvvvvvvvvvvwwwwwwwwwwxxxxxxxxxxyyyyyyyyyyzzzzzzzzzzyyyyyyyyyyxxxxxxxxxxwwwwwwwwwwvvvvvvvvvvuuuuuuuuuuttttttttttssssssssssrrrrrrrrrrqqqqqqqqqqppppppppppoooooooooonnnnnnnnnnmmmmmmmmmmllllllllllkkkkkkkkkkjjjjjjjjjjiiiiiiiiiihhhhhhhhhhggggggggggffffffffffeeeeeeeeeeddddddddddccccccccccbbbbbbbbbbaaaa")); // aca
    }

    public static String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }

        char[] chars = s.toCharArray();
        String longestPalindrome = s.length() > 0 ? s.substring(0,1) : "";

        for (int i = 0; i < s.length() - 1; i++) {
            char firstChar = chars[i];
            for (int j = s.length() - 1; j > i; j--) {
                char secondChar = chars[j];
                if (firstChar == secondChar) {
                    char[] tempChars = Arrays.copyOfRange(chars, i, j + 1);
                    StringBuilder sbReverse = new StringBuilder();
                    StringBuilder sbStraight = new StringBuilder();
                    for (char tempChar : tempChars) {
                        sbStraight.append(tempChar);
                        sbReverse.insert(0, tempChar);
                    }
                    if (sbReverse.toString().equals(sbStraight.toString()) && sbReverse.toString().length() > longestPalindrome.length()) {
                        longestPalindrome = sbReverse.toString();
                    }
                }
            }
        }

        return longestPalindrome;
    }
}
