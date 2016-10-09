package easy;

public class prob299 {
    public String getHint(String secret, String guess) {
        int[] count_s = new int[10];
        int[] count_g = new int[10];
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            int a = secret.charAt(i) - '0';
            int b = guess.charAt(i) - '0';
            if (a == b) {
                bulls++;
            }
            else {
                count_s[a]++;
                count_g[b]++;
            }
        }
        for (int i = 0; i < 10; i++) {
            cows += Math.min(count_s[i], count_g[i]);
        }
        return Integer.toString(bulls) + 'A' + Integer.toString(cows) + 'B';
    }
}
