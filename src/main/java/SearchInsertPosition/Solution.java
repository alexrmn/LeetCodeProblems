package SearchInsertPosition;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {

        int[] nums = {1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(nums, target));
    }

    static public int searchInsert(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }

            if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        if (nums[mid] < target) {
            return mid + 1;
        } else {
            return mid;
        }

    }
}