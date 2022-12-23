package LongestCommonPrefix;

import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;


public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        // sort array by length
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        // print sorted array
        for (String string : strs) {
            System.out.println(string + " ");

        }

        // set prefix as the shortest word in the array, check if every other word contains this prefix, if not
        // remove one letter from the prefix and go through the array again.
        // stop if all the words have the same prefix or if the prefix is reduced to 0 chars
        // i used a list of ints to keep track of the words containing the prefix (added 1 if the word containted
        // the prefix and 0 if it didnt

        String prefix = strs[0];
        while (prefix != "") {
            ArrayList<Integer> isCommonPrefix = new ArrayList<>();
            for (String string : strs) {
                //check if the word contains the prefix and if the prefix is at the beginning of the word
                if ((string.contains(prefix) && string.indexOf(prefix) == 0)) {
                    isCommonPrefix.add(1);
                } else {
                    isCommonPrefix.add(0);
                }

            }
            //if not all words contained the prefix remove 1 char from the end of the prefix
            if (isCommonPrefix.contains(0) ) {
                prefix = prefix.substring(0, prefix.length()-1);
            } else return prefix;

        }

        return "";
    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println("Longest common prefix is: " + longestCommonPrefix(strs));


    }

}