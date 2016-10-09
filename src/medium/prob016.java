package medium;

public class prob016 {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int closest = 0;
        for (int i = 0; i < 3 && i < nums.length; i++) closest += nums[i];
        if (nums.length < 4) return closest;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                    if (closest == target) return closest;
                }
                if (sum > target) k--;
                else j++;
            }
        }
        return closest;
    }
}
