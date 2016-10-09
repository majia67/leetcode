package easy;

public class prob172 {
    public int trailingZeroes(int n) {
        int result = 0;
        int div;
        for (long i = 5; (div = (int) (n / i)) > 0; i *= 5 )
            result += div;
        return result;
    }
}
