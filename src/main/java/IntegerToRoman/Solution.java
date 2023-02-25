package IntegerToRoman;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        System.out.println(intToRoman(3));
    }

    public static String intToRoman(int num) {
        Map<String, Integer> symbols = new LinkedHashMap<>();
        symbols.put("M", 1000);
        symbols.put("CM", 900);
        symbols.put("D", 500);
        symbols.put("CD", 400);
        symbols.put("C", 100);
        symbols.put("XC", 90);
        symbols.put("L", 50);
        symbols.put("XL", 40);
        symbols.put("X", 10);
        symbols.put("IX", 9);
        symbols.put("V", 5);
        symbols.put("IV", 4);
        symbols.put("I", 1);

        String romanNum = "";

        for (String s : symbols.keySet()) {
            while (num >= symbols.get(s)){
                romanNum += s;
                num -= symbols.get(s);
            }
        }

        return romanNum;
    }
}
