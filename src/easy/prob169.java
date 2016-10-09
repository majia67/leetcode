package easy;
import java.util.Arrays;

public class prob169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int i;
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i+1]) {
                if (count > nums.length / 2) break;
                else count = 1;
            }
            else count++;
        }
        return nums[i];
   }
}
