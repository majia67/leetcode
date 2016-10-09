package easy;

public class prob266 {
    
    public boolean canPermutePalindrome(String s) {
        int[] charSetCount = new int[256];
        int i;
        
        for (i = 0; i < s.length(); i++) {
            charSetCount[s.charAt(i)]++;
        }
        
        int oddCount = 0;
        for (i = 0; i < 256; i++) {
            if (charSetCount[i] % 2 != 0) {
                oddCount++;
            }
        }
        
        if (oddCount < 2) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
