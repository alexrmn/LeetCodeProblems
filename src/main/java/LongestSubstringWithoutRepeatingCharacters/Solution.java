package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
    public static int lengthOfLongestSubstring(String s) {

        String[] splitString = s.split("");
        Map<String, Integer> sequenceLengths = new HashMap<>();

        String currentSequence = "";
        int sequenceStartIndex = 0;
        int i = sequenceStartIndex;


        while (i < splitString.length) {
            String letter = splitString[i];
            if (currentSequence.contains(letter)) {
                sequenceLengths.put(currentSequence, currentSequence.length());
                currentSequence = "";
                i = sequenceStartIndex;
                sequenceStartIndex++;
                continue;
            }

            currentSequence = currentSequence.concat(letter);
            i++;
        }
        sequenceLengths.put(currentSequence, currentSequence.length());

        return sequenceLengths.values().stream().max(Integer::compare).get();
    }
}