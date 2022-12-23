package PalindromeNumber;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int num = x;
        int test = 0;
        if (x < 0) {
            return false;
        }
        while (x != 0) {
            test = test * 10 + x % 10;
            x = x / 10;
        }
        //System.out.println(test);
        return test == num;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));

    }

}