package easy;

public class prob070 {
    public int climbStairs(int n) {
        int[] level = new int[n+1];
        level[0] = 1; level[1] = 1;
        for (int i = 2; i < n+1; i++) {
            level[i] = level[i-2] + level[i-1];
        }
        return level[n];
    }
}
