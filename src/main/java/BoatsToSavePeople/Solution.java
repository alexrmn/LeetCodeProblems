package BoatsToSavePeople;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] people = {3,2,2,1};
        int limit = 3;
        System.out.println(numRescueBoats(people, limit));
    }

    public static int numRescueBoats(int[] people, int limit) {
        int left = 0;
        int right = people.length - 1;
        int boats = 0;
        Arrays.sort(people);

        while (left <= right) {
            if (people[left] + people[right] > limit) {
                boats++;
                right -= 1;
            } else {
                boats++;
                left += 1;
                right -= 1;
            }
        }

        return boats;
    }
}
