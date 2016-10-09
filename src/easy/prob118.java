package easy;

import java.util.List;
import java.util.ArrayList;


public class prob118 {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if (numRows > 0) {
            List<Integer> pre = new ArrayList<Integer>();
            pre.add(1);
            res.add(pre);
            for (int i = 1; i < numRows; i++) {
                List<Integer> line = new ArrayList<Integer>();
                line.add(1);
                for (int j = 1; j < i; j++) {
                    line.add(pre.get(j-1) + pre.get(j));
                }
                line.add(1);
                res.add(line);
                pre = line;
            }            
        }

        return res;
        
    }
}
