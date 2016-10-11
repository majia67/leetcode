package hard;

public class Prob004_Median_of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int m = nums1.length;
        int n = nums2.length;
        int maxi = m;
        int mini = 0;
        int i = 0, j = 0;
        
        while(mini <= maxi) {
            i = (mini + maxi) / 2;
            j = (n + m + 1) / 2 - i;
            if (i > 0 && j < n && nums1[i-1] > nums2[j])
                maxi = i - 1;
            else if (j > 0 && i < m && nums2[j-1] > nums1[i])
                mini = i + 1;
            else {
                //Find i
                break;
            }
        }
        
        int max_of_left;
        int min_of_right;
        
        if (i == 0)
            max_of_left = nums2[j-1];
        else if (j == 0)
            max_of_left = nums1[i-1];
        else
            max_of_left = Math.max(nums1[i-1], nums2[j-1]);
        
        if ((n + m) % 2 == 1)
            return max_of_left;
            
        if (i == m)
            min_of_right = nums2[j];
        else if (j == n)
            min_of_right = nums1[i];
        else
            min_of_right = Math.min(nums1[i], nums2[j]);

        return (max_of_left + min_of_right) / 2.0;
    }
}
