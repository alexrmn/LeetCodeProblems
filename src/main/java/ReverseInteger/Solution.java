package ReverseInteger;

public class Solution {

    public static void main(String[] args) {
        int input = 1534236469;

        System.out.println(reverse(input));
    }

    public static  int reverse(int input) {
        long result = 0;
        int savedInput = input;
        while (input != 0) {
            result = result * 10 + input % 10;
            input = input / 10;
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;
    }
}
