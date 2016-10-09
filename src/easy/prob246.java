package easy;
public class prob246 {
    public boolean isStrobogrammatic(String num) {
        int len = num.length();
        int halflen = len % 2 == 0 ? len / 2 : (len + 1) / 2;
        for (int i = 0; i < halflen; i++) {
            char c = num.charAt(i);
            char d = num.charAt(len - i - 1);
            switch(c) {
            case '0':
            case '1':
            case '8':
                if (d != c) return false;
                break;
            case '6':
                if (d != '9') return false;
                break;
            case '9':
                if (d != '6') return false;
                break;
            default:
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        prob246 test = new prob246();
        boolean result = test.isStrobogrammatic("8008");
        System.out.println(result);
    }
}