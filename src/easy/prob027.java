package easy;
import java.util.Arrays;

public class prob027 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length;
        while(i < j) {
            if (nums[i] == val) {
                nums[i] = nums[j-1];
                j--;
            }
            else {
                i++;
            }
        }
        return j;
    }
    
    public static void main(String[] args) {
        prob027 test = new prob027();
        int[] nums = {};
        int val = 5;
        int result = test.removeElement(nums, val);
        System.out.println(Arrays.toString(nums));
        System.out.println(result);
    }
}
