package easy;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s) {
        List<Character> parentheses = new ArrayList<>();

        for (int iterator = 0; iterator < s.length(); iterator++) {
            char temp = ' ';
            if (s.charAt(iterator) == ']') temp = '[';
            if (s.charAt(iterator) == ')') temp = '(';
            if (s.charAt(iterator) == '}') temp = '{';
            if (!parentheses.isEmpty() && parentheses.get(parentheses.size() - 1).equals(temp)) {
                parentheses.remove(parentheses.size() - 1);
            } else {
                parentheses.add(s.charAt(iterator));
            }
        }

        return parentheses.isEmpty();
    }
}
