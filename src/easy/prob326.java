package easy;

public class prob326 {
    public boolean isPowerOfThree(int n) {
        if (n < 1) return false;
        while (n % 3 == 0) { n /= 3; }
        return n == 1;
    }
    
    public static void main(String[] args) {
        prob326 test = new prob326();
        System.out.println(test.isPowerOfThree(3));
    }
}
