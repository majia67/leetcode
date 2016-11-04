/*
33. Search in Rotated Sorted Array

Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.
 */
package hard;

public class Prob033_Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        int st = 0;
        int ed = nums.length - 1;
        int result = -1;
        while (st <= ed) {
            int mid = ed + (st - ed) / 2;
            if (nums[mid] >= nums[st] && nums[mid] <= nums[ed]) {
                // the array in the range is already sorted
                result = binarySearch(nums, target, st, ed);
                break;
            } else if (nums[mid] >= nums[st]) {
                result = binarySearch(nums, target, st, mid);
                if (result != -1) {
                    break;
                } else {
                    // can't find in the first half, redo the process in the second half
                    st = mid + 1;
                }
            } else {
                result = binarySearch(nums, target, mid, ed);
                if (result != -1) {
                    break;
                } else {
                    // can't find in the second half, redo the process in the first half
                    ed = mid - 1;
                }
            }
        }
        return result;
    }
    
    public int binarySearch(int[] nums, int target, int st, int ed) {
        while (st <= ed) {
            int mid = ed + (st - ed) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                st = mid + 1;
            } else {
                ed = mid - 1;
            }
        }
        return -1;
    }
}
