package easy;

public class prob066 {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        digits[i] += 1;
        while (i > 0) {
            if (digits[i] > 9) {
                digits[i] = 0;
                digits[i-1] += 1;
                i--;
            }
            else {
                break;
            }
        }
        if (digits[0] > 9) {
            int[] sol = new int[digits.length + 1];
            sol[0] = 1;
            digits[0] = 0;
            for (i = 1; i < sol.length; i++) {
                sol[i] = digits[i-1];
            }
            return sol;
        }
        else {
            return digits;
        }
    }
}
