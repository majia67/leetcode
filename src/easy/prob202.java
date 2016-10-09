package easy;

public class prob202 {
    public boolean isHappy(int n) {
        int loop = 0;
        while (n != 1 && loop < 7) {
            int sum = 0;
            while (n > 0) {
                int t = n % 10;
                sum += t * t;
                n /= 10;
            }
            n = sum;
            loop++;
        }
        if (n == 1) return true;
        else return false;
    }
    
    public static void main(String[] args) {
        prob202 test = new prob202();
        long sum = 0;
        for (int i = 1000001; i < 10000000; i++) {
            if (test.isHappy(i)) {
                System.out.println(i);
                sum += i;
            }
        }
        System.err.println(sum);
    }
}
