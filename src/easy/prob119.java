package easy;

import java.util.ArrayList;
import java.util.List;

public class prob119 {
    public List<Integer> getRow(int rowIndex) {
        int[] pascal = new int[rowIndex + 1];
        pascal[0] = 1;
        if (rowIndex > 0) {
            pascal[1] = 1;
        }
        for (int i = 2; i <= rowIndex; i++) {
            for (int j = i; j > 0; j--) {
                pascal[j] = pascal[j-1] + pascal[j];
            }
        }
        List<Integer> result = new ArrayList<Integer>(pascal.length);
        for (int i : pascal) {
            result.add(i);
        }
        return result;
    }
    
    public static void main(String[] args) {
        prob119 test = new prob119();
        System.out.println(test.getRow(17));
    }
}
