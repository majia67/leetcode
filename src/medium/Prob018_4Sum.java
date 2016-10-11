package medium;

public class Prob018_4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j-1]) continue;
                int k = j + 1;
                int m = nums.length - 1;
                int subTarget = target - nums[i] - nums[j];
                while (k < m) {
                    if (k > j + 1 && nums[k] == nums[k-1]) {
                        k++;
                        continue;
                    }
                    int sum = nums[k] + nums[m];
                    if (sum == subTarget) {
                        list.add(Arrays.asList(new Integer[] {nums[i], nums[j], nums[k], nums[m]}));
                        k++; m--;
                    }
                    else if (sum > subTarget) m--;
                    else k++;
                }
            }
        }
        return list;
    }
}
