package TwoSum;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        int[] sol = { 0, 0 };
        int[] numsBeforeSort = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int a=0;
        int b=0;
        for (int i = 0; i < nums.length - 1; i++) {
            boolean found = false;
            int begin= i+1;
            int end = nums.length-1;
            while (begin <= end) {
                int mid = (begin + end) / 2;
                if (nums[i] + nums[mid] == target) {
                    a = nums[i];
                    b = nums[mid];
                    found = true;
                    break;
                }
                if (nums[i] + nums[mid] > target) {
                    end = mid-1;
                }
                if (nums[i] + nums[mid] < target) {
                    begin = mid +1;
                }

            }
            if (found) {
                break;
            }

        }

        for (int i = 0; i < numsBeforeSort.length; i++) {
            if (numsBeforeSort[i] == a) {
                sol[0] = i;
                break;
            }

        }

        for (int i = numsBeforeSort.length-1; i >= 0; i--) {
            if (numsBeforeSort[i] == b) {
                sol[1] = i;
                break;
            }

        }

        return sol;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 3};
        int target = 6;
        int[] sol = twoSum(nums, target);
        System.out.println(sol[0] + " " + sol[1]);
    }

}
