package easy;

public class PercentageOfLetterInString {

    // https://leetcode.com/problems/percentage-of-letter-in-string/
    public static void main(String[] args) {
        System.out.println(percentageLetter("foobar", 'o'));
    }

    public static int percentageLetter(String s, char letter) {
        int countOfLetter = 0;

        for (char c : s.toCharArray()) {
            if (c == letter) {
                countOfLetter++;
            }
        }

        return (countOfLetter * 100) / s.length();
    }
}
