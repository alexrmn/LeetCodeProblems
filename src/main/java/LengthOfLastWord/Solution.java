package LengthOfLastWord;

class Solution {

    public static void main(String[] args) {
        String input = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(input));
    }

    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
