package easy;

public class prob014 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        int minIndex = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < strs[minIndex].length()) {
                minIndex = i;
            }
        }
        
        for (int i = 0; i < strs[minIndex].length(); i++) {
            char key = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != key)
                    return strs[0].substring(0, i);
            }
        }
        
        return strs[minIndex];
    }
}
