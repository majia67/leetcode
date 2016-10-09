package easy;

public class prob205 {
    public boolean isIsomorphic(String s, String t) {
        int[] map_s = new int[128];
        int[] map_t = new int[128];
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            int d = t.charAt(i);
            if ((map_s[c] != 0 && map_s[c] != d) || (map_t[d] != 0 && map_t[d] != c)) return false;
            map_s[c] = d;
            map_t[d] = c;
        }
        return true;
    }
}
