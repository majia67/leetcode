package easy;

public class prob171 {
    public int titleToNumber(String s) {
        int len = s.length();
        int times = 1;
        int result = 0;
        for (int i = len-1; i >= 0; i--) {
            result += (s.charAt(i) - 64) * times;
            times *= 26;
        }
        return result;
    }
}
