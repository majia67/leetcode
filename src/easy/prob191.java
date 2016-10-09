package easy;

public class prob191 {
    public int hammingWeight(int n) {
        System.err.println(Integer.bitCount(n));
        System.err.println(Integer.toBinaryString(n));
        int nums = 0;
        while (n != 0) {
            if ((n & 0x80000000) != 0x0) {
                nums++;
            }
            n = n << 1;
        }
        return nums;
    }
    
    public static void main(String[] args) {
        prob191 test = new prob191();
        int t = 0x1111;
        System.out.println(test.hammingWeight(t));
    }
}
