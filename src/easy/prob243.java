package easy;

public class prob243 {
    public int shortestDistance(String[] words, String word1, String word2) {
        int lastpos1 = Integer.MAX_VALUE;
        int lastpos2 = Integer.MAX_VALUE;
        int shortdist = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                lastpos1 = i;
                shortdist = Math.min(shortdist, Math.abs(lastpos1 - lastpos2));
            }
            if (words[i].equals(word2)) {
                lastpos2 = i;
                shortdist = Math.min(shortdist, Math.abs(lastpos1 - lastpos2));
            }
        }
        return shortdist;
    }
}
