package easy;

public class prob020 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch(c) {
                case ')':
                case ']':
                case '}':
                    if (st.empty())
                        return false;
                    char d = st.pop();
                    if (c == ')' && d != '(' 
                     || c == ']' && d != '[' 
                     || c == '{' && d != '}')
                        return false;
                    break;
                case '(':
                case '[':
                case '{':
                    st.push(c);
                    break;
            }
        }
        if (st.empty())
            return true;
        else
            return false;
    }
}
