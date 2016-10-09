package easy;
import java.util.LinkedList;
import java.util.List;

public class prob293 {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> result = new LinkedList<String>();
        int len = s.length();
        for (int i = 0; i < len - 1; i++) {
            if (s.charAt(i) == '+' && s.charAt(i+1) == '+') {
                result.add(s.substring(0, i > 0 ? i : 0) + "--" + s.substring(Math.min(len, i+2)));
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        prob293 sol = new prob293();
        System.out.println(sol.generatePossibleNextMoves("++++"));
    }
}
