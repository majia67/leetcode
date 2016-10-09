package easy;

public class prob058 {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int l = 0;
        while (i >= 0 && s.charAt(i) == ' ') { i--; }
        while (i >= 0 && s.charAt(i) != ' ') { i--; l++; }
        return l;
    }
}
