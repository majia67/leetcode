package medium;

public class Prob015_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            if (nums[i] > 0) break;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (j > i + 1 && nums[j] == nums[j-1]) {
                    j++;
                    continue;
                }
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> res = new LinkedList<Integer>();
                    res.add(nums[i]);
                    res.add(nums[j]);
                    res.add(nums[k]);
                    list.add(res);
                    j++; k--;
                }
                else if (sum > 0) k--;
                else j++;
            }
        }
        return list;
    }
}
