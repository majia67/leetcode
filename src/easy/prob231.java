package easy;

public class prob231 {
    public boolean isPowerOfTwo(int n) {
        return (n != 0) && ((n & (n-1)) == 0);
    }
}
