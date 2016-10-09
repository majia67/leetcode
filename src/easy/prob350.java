package easy;
import java.util.Arrays;

public class prob350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i, j, k;
        i = j = k = 0;
        int[] intersection = new int[Math.max(nums1.length, nums2.length)];
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                intersection[k++] = nums1[i];
                i++; j++;
            }
            else if (nums1[i] < nums2[j]){
                i++;
            }
            else {
                j++;
            }
        }
        
        int[] result = new int[k];
        for (i = 0; i < k; i++) {
            result[i] = intersection[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        prob350 test = new prob350();
        int[] result = test.intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
