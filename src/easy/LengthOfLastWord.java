package easy;

public class LengthOfLastWord {

    // https://leetcode.com/problems/length-of-last-word/
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    public static int lengthOfLastWord(String s) {
        int result = 0;
        for (String str : s.split(" ")) {
            str = str.trim();
            if (str.length() != 0) {
                result = str.length();
            }
        }

        return result;
    }
}
