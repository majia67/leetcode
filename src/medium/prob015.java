package medium;

public class prob015 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (j > i + 1 && nums[j] == nums[j-1]) {
                    j++;
                    continue;
                }
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) k--;
                else if (sum < 0) j++;
                else {
                    List<Integer> rlt = new ArrayList<>();
                    rlt.add(nums[i]);
                    rlt.add(nums[j]);
                    rlt.add(nums[k]);
                    ans.add(rlt);
                    j++; k--;
                }
            }
        }
        return ans;
    }
}
