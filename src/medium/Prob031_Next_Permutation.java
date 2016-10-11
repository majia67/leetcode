package medium;

public class Prob031_Next_Permutation {
    public void nextPermutation(int[] nums) {
        if (nums.length < 2) return;
        // find from the tail the first element that is smaller than its next element;
        int first = nums.length - 2;
        while (first >= 0 && nums[first] >= nums[first+1]) { first--; }
        
        int second = nums.length - 1;
        if (first >= 0) {
            while (second > first && nums[second] <= nums[first]) { second--; }
            swap(nums, first, second);
            first++;
            second = nums.length - 1;
        }
        else {
            first = 0;
        }
        
        while (first < second) {
            swap(nums, first, second);
            first++;
            second--;
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
