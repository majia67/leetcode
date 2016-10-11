package medium;

public class Prob022_Generate_Parentheses {
    List<String> list;
    
    public List<String> generateParenthesis(int n) {
        list = new LinkedList<String>();
        generator("", n, 0);
        return list;
    }
    
    private void generator(String par, int left, int right) {
        if (left == 0 && right == 0)
            list.add(par);
        else {
            if (left > 0)
                generator(par + "(", left - 1, right + 1);    
            if (right > 0)
                generator(par + ")", left, right - 1);        
        }
    }
}
