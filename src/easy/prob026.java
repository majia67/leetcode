package easy;
import java.util.Set;
import java.util.HashSet;

public class prob026 {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (!set.contains(nums[j])) {
                set.add(nums[j]);
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
