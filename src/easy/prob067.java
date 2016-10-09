package easy;

public class prob067 {
    public static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            String c = a;
            a = b;
            b = c;
        }
        int i = a.length() - 1;
        int j = b.length() - 1;
        char[] t = a.toCharArray();
        
        int carry = 0;
        while (j > -1) {
            t[i] += b.charAt(j) - '0' + carry;
            carry = t[i] / '2';
            if (carry == 1) t[i] -= 2;
            i--; j--;
        }
        
        while (i > -1 && carry != 0) {
            t[i] += carry;
            carry = t[i] / '2';
            if (carry == 1) t[i] -= 2;
            i--;
        }
        
        String r = new String(t);
        return carry == 0 ? r : "1" + r;
    }
    
    public static void main(String[] args) {
        System.out.println(addBinary("11", "11"));
    }
}
