package easy;

public class prob374 {
    public int guessNumber(int n) {
        long low = 1;
        long high = n;
        long num = (high + low) / 2;
        while(high - low > 1) {
            int guessResult = super.guess((int) num);
            if (guessResult == 0) return (int) num;
            if (guessResult == 1)
                low = num;
            else
                high = num;
            num = (high + low) / 2;
        }
        if (super.guess((int) low) == 0)
            return (int) low;
        else
            return (int) high;
    }
}
