/*
76. Minimum Window Substring

Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

For example,
S = "ADOBECODEBANC"
T = "ABC"
Minimum window is "BANC".

Note:
If there is no such window in S that covers all characters in T, return the empty string "".

If there are multiple such windows, you are guaranteed that there will always be only one unique minimum window in S.
 */
package hard;

public class Prob076_Minimum_Window_Substring {
    public String minWindow(String s, String t) {
        int[] mapS = new int[128];
        int[] mapT = new int[128];
        
        for (int i = 0; i < mapS.length; i++) { mapS[i] = 0; }
        for (int i = 0; i < mapT.length; i++) { mapT[i] = 0; }
        for (int i = 0; i < t.length(); i++) { mapT[t.charAt(i)]++; }
        
        int slow = 0;
        int fast = 0;
        int count = 0;
        int minWinLen = Integer.MAX_VALUE;
        int minStartPos = -1;
        for (; fast < s.length(); fast++) {
            char c = s.charAt(fast);
            mapS[c]++;
            if (mapT[c] > 0 && mapS[c] <= mapT[c])
                count++;
            if (count == t.length()) {
                // find a valid window
                // shift slow pointer to a nearest valid position
                char cs = s.charAt(slow);
                while (mapS[cs] > mapT[cs]) {
                    mapS[cs]--;
                    slow++;
                    cs = s.charAt(slow);
                }
//                System.out.println(slow + " " + fast);
                if (fast - slow + 1 < minWinLen) {
                    minWinLen = fast - slow + 1;
                    minStartPos = slow;
                }
                mapS[cs]--;
                count--;
                slow++;
            }
        }
        
        if (minStartPos >= 0)
            return s.substring(minStartPos, minStartPos + minWinLen);
        else
            // the window doesn't exist
            return "";
    }
}
