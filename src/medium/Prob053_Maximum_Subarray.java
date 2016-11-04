/*
53. Maximum Subarray

Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */
package medium;

public class Prob053_Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = 0;
        int fast = 0;
        for (; fast < nums.length; fast++) {
            sum += nums[fast];
            if (sum > maxSum) maxSum = sum;
            if (sum < 0) {
                // give up the current window and start a new one;
                sum = 0;
            }
        }
        return maxSum;
    }
}
