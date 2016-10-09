package easy;
import java.util.HashSet;
public class prob349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>(nums1.length);
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        
        HashSet<Integer> setResult = new HashSet<Integer>(nums2.length);
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                setResult.add(nums2[i]);
            }
        }
        
        int[] result = new int[setResult.size()];
        int i = 0;
        for (Integer it : setResult) {
            result[i++] = it.intValue();
        }
        
        return result;
    }
}
