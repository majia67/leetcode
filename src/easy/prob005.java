package easy;

public class prob005 {
    
    private int maxst;
    private int maxLen;
    
    private void findPalindrome(char[] sc, int j, int k) {
        while (j > -1 && k < sc.length && sc[j] == sc[k]) { j--; k++; }
//        System.err.println(j + " " + k);
        if (k - j - 1 > maxLen) {
            maxst = j + 1;
            maxLen = k - j - 1;
        }        
    }
    
    public String longestPalindrome(String s) {
        if (s.length() == 0) return "";
        if (s.length() == 1) return s;
        
        char[] sc = s.toCharArray();
        maxLen = 1;
        maxst = 0;
        
        for (int i = 0; i < sc.length - 1; i++) {
            findPalindrome(sc, i-1, i+1);
            findPalindrome(sc, i, i+1);
//            if (maxst + maxLen > i)
//                i = maxst + maxLen - 1;
        }
        
        return s.substring(maxst, maxst + maxLen);
    }
    
    public static void main(String[] args) {
        prob005 test = new prob005();
        String t = "ccc";
        System.out.println(test.longestPalindrome(t));
    }
}
