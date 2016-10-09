package easy;

public class prob088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int[] nums1_b = new int[m];
        for (i = 0; i < m; i++)
            nums1_b[i] = nums1[i];
        i = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1_b[i] < nums2[j]) {
                nums1[k] = nums1_b[i];
                k++; i++;
            }
            else {
                nums1[k] = nums2[j];
                k++; j++;
            }
        }
        while (i < m) {
            nums1[k] = nums1_b[i];
            k++; i++;
        }
        while (j < n) {
            nums1[k] = nums2[j];
            k++; j++;            
        }
    }
}
