package easy;

public class Prob283_Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                if (fast > slow) {
                    nums[fast] = 0;
                }
                slow++;
            }
        }
    }
}
