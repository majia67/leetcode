package easy;

public class prob258 {
    
    public int addDigits(int num) {
        int result = num % 9;
        if (result == 0 && num != 0) {
            return 9;
        }
        else {
            return result;
        }
    }
    
    public static void main(String[] args) {
        prob258 sol = new prob258();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + " :" + sol.addDigits(i));
        }
    }

}
