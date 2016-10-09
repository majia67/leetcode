package easy;

public class prob342 {
    public boolean isPowerOfFour(int num) {
        if (num < 1) return false;
        while (num > 1 && num % 4 == 0) { num /= 4; }
        if (num == 1) return true;
        else return false;
    }
}
