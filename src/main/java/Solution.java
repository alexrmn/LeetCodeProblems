import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(array));

    }

    public static boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int n : arr) {
            if (!occurrences.containsKey(n)) {
                occurrences.put(n, 1);
            } else {
                occurrences.put(n, occurrences.get(n) + 1);
            }
        }

//        for (Integer i : occurrences.values()) {
//            int count = 0;
//            for (Integer j : occurrences.values()) {
//                if (i.equals(j)) {
//                    count++;
//                }
//            }
//            if (count > 1) {
//                result = false;
//                break;
//            }
//        }

        Set <Integer> uniqueOccurrences = new HashSet<>(occurrences.values());

        return occurrences.values().size() == uniqueOccurrences.size();
    }
}
