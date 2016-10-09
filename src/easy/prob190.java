package easy;

public class prob190 {
    public static int reverseBits(int n) {
        int b = 0;
        for (int i = 0; i < 32; i++) {
            b <<= 1;
            b |= (n & 1);
            n >>>= 1;
        }
        return b;
    }
    
    public static void main(String... args) {
        long i = 4294967295L;
        System.out.println(reverseBits((int) i));
    }
}
