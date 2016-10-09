package easy;
//344. Reverse String

public class prob344 {
    
    public String reverseString(String s) {
//        return new StringBuilder(s).reverse().toString();
        int len = s.length();
        char[] in = s.toCharArray();
        char[] out = new char[len];
        for (int i = 0; i < len; i++) {
            out[i] = in[len-i-1];
        }
        return new String(out);
    }
    
    public static void main(String[] args) {
        prob344 sol = new prob344();
        String re = sol.reverseString("Hello, World!");
        System.out.println(re);
    }

}
