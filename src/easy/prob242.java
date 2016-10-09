package easy;

public class prob242 {
    public boolean isAnagram(String s, String t) {
        int len = s.length();
        if (len != t.length()) return false;
        
        int[] charSet = new int[256];
        
        for (int i = 0; i < len; i++) {
            charSet[s.charAt(i)]++;
        }
        
        for (int i = 0; i < len; i++) {
            charSet[t.charAt(i)]--;
        }
        
        for (int i = 0; i < 256; i++) {
            if (charSet[i] != 0) return false;
        }
        
        return true;
    }
}
