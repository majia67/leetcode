package easy;

import java.util.Arrays;

public class prob151 {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        System.out.println(Arrays.toString(words));
        if (words.length == 0)
            return new String();
        else if (words.length == 1)
            return words[0];
        else {
            StringBuilder sb = new StringBuilder(s.length());
            for (int i = words.length - 1; i > 0; i--) {
                sb.append(words[i] + " ");
            }
            sb.append(words[0]);
            return sb.toString();
        }
    }
    
    public static void main(String[] args) {
        prob151 test = new prob151();
        System.out.println(test.reverseWords("   "));
    }
}
