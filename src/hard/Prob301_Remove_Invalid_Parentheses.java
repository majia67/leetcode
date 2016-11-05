package hard;

public class Prob301_Remove_Invalid_Parentheses {
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        
        if (s == null) return res;
        
        Queue<String> que = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        
        que.add(s);
        visited.add(s);
        
        boolean found = false;
        while (!que.isEmpty()) {
            s = que.poll();
            
            if (isValid(s)) {
                res.add(s);
                found = true;
            }
            
            if (found) continue;
            
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '(' && s.charAt(i) != ')') continue;
                
                String t = s.substring(0, i) + s.substring(i + 1);
                if (!visited.contains(t)) {
                    que.add(t);
                    visited.add(t);
                }
            }
        }
        
        return res;
    }
    
    private boolean isValid(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') count++;
            else if (s.charAt(i) == ')') {
                count--;
                if (count < 0) return false;
            }
        }
        return count == 0;
    }
}
