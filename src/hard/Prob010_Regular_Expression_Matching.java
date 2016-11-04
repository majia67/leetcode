package hard;

public class Prob010_Regular_Expression_Matching {
    
    // Brute force method which scans from the start to the end and validate the pattern
    public static boolean isMatch(String s, String p) {
        return isMatchHelper(s, 0, p, 0);
    }
    
    private static boolean isMatchHelper(String s, int i, String p, int j) {
        while (i < s.length() && j < p.length()) {
            System.out.println(i + " " + j);
            if (j+1 < p.length() && p.charAt(j+1) == '*') {
                // * case
                if (isMatchHelper(s, i, p, j+2) == true)
                    return true;                
                while (i < s.length() && (p.charAt(j) == '.' || p.charAt(j) == s.charAt(i))) {
                    System.out.println("* " + i + " " + j);
                    if (isMatchHelper(s, i, p, j+2) == true)
                        return true;
                    i++;
                };
                j += 2;
                continue;
            }
            else if (p.charAt(j) == '.') {
                i++; j++;
            }
            else {
                if (s.charAt(i) != p.charAt(j))
                    return false;
                i++; j++;
            }
        }

        System.out.println(i + " " + j);
        if (i < s.length())
            return false;
        else if (j < p.length()) {
            while (j+1 < p.length() && p.charAt(j+1) == '*') { j += 2; }
            if (j < p.length()) return false;
        }
        return true;
    }
    
    /* Dynamic programming approach
       1, If p.charAt(j) == s.charAt(i) :  dp[i][j] = dp[i-1][j-1];
       2, If p.charAt(j) == '.' : dp[i][j] = dp[i-1][j-1];
       3, If p.charAt(j) == '*': 
          here are two sub conditions:
                      1   if p.charAt(j-1) != s.charAt(i) : dp[i][j] = dp[i][j-2]  //in this case, a* only counts as empty
                      2   if p.charAt(i-1) == s.charAt(i) or p.charAt(i-1) == '.':
                                     dp[i][j] = dp[i-1][j]    //in this case, a* counts as multiple a 
                                  or dp[i][j] = dp[i][j-1]   // in this case, a* counts as single a
                                  or dp[i][j] = dp[i][j-2]   // in this case, a* counts as empty
     */
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        
        boolean[][] match = new boolean[s.length()+1][p.length()+1];
        match[0][0] = true;
        
        for (int j = 1; j < p.length(); j++) {
            if (p.charAt(j) == '*' && match[0][j-1]) {
                match[0][j+1] = true;
            }
        }
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == '.' || p.charAt(j) == s.charAt(i)) {
                    match[i+1][j+1] = match[i][j];
                }
                else if (p.charAt(j) == '*') {
                    if (p.charAt(j-1) != '.' && p.charAt(j-1) != s.charAt(i)) {
                        match[i+1][j+1] = match[i+1][j-1];
                    }
                    else {
                        match[i+1][j+1] = match[i+1][j-1] || match[i+1][j] || match[i][j+1];
                    }
                }
            }
        }
        
        return match[s.length()][p.length()];
    }
    
    
    public static void main(String[] args) {
        System.out.println(isMatch("aaa", "ab*a"));
    }

}
