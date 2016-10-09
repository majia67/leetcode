package easy;

public class prob283 {
    public void moveZeroes(int[] nums) {
        for (int i = 0, j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                //Swap two integers
                nums[j] = nums[i] + (nums[i] = nums[j]) - nums[j]; 
                i++;
            }
        }
    }
}
