package easy;

public class prob290 {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length)
            return false;
        Map<Character, String> map = new HashMap<Character, String>();
        Map<String, Character> map_r = new HashMap<String, Character>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                String word = map.get(c);
                if (!word.equals(words[i]))
                    return false;
            }
            else if (map_r.containsKey(words[i])) {
                Character cha = map_r.get(words[i]);
                if (cha != c)
                    return false;
            }
            else {
                map.put(c, words[i]);
                map_r.put(words[i], c);
            }
        }
        return true;
    }
}
