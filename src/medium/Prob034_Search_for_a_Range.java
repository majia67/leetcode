package medium;

public class Prob034_Search_for_a_Range {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        // first binary search finds the lower index of the target
        int st = 0;
        int ed = nums.length - 1;
        while (st < ed) {
            int mid = st + (ed - st) / 2;   // floor function
            if (nums[mid] < target)
                st = mid + 1;
            else
                ed = mid;
        }
        
        if (nums[st] == target) {
            // the target exists in the array
            result[0] = st;
            
            // second binary search finds the higher index of the target
            ed = nums.length - 1;
            while (st < ed) {
                int mid = st + (ed - st + 1) / 2;   // ceiling function
                if (nums[mid] <= target)
                    st = mid;
                else
                    ed = mid - 1;
            }
            result[1] = ed;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] input = {1, 1, 2, 2, 3, 3, 3, 4, 5, 6, 6, 7};
        int target = 3;
        Prob034_Search_for_a_Range test = new Prob034_Search_for_a_Range();
        int[] result = test.searchRange(input, target);
        System.out.println(result[0] + "," + result[1]);
    }
}
