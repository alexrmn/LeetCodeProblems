package UniqueNumberOfOccurrences;

import java.util.*;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int[] array = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(array));

    }

    public static boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int number : arr) {
            if (!occurrences.containsKey(number)) {
                occurrences.put(number, 1);
            } else {
                occurrences.put(number, occurrences.get(number) + 1);
            }
        }


        Set <Integer> uniqueOccurrences = new HashSet<>(occurrences.values());

        return occurrences.values().size() == uniqueOccurrences.size();
    }
}
