package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("III")); // 3
        System.out.println(romanToInt("LVIII")); // 58
        System.out.println(romanToInt("MCMXCIV")); // 1994
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int sum = romanMap.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 1; i > 0; i--) {
            if (romanMap.get(s.charAt(i - 1)) < romanMap.get(s.charAt(i))) {
                sum = sum - romanMap.get(s.charAt(i - 1));
            } else {
                sum = sum + romanMap.get(s.charAt(i - 1));
            }
        }
        return sum;
    }
}