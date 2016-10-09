package easy;
import java.util.LinkedHashSet;
import java.util.Set;

public class TwoSum {
    
    private Set<Integer> set = new LinkedHashSet<>();
    private Set<Integer> dup = new LinkedHashSet<>();
    
    // Add the number to an internal data structure.
    public void add(int number) {
        if(set.contains(number))
            dup.add(number);
        else
            set.add(number);
    }

    // Find if there exists any pair of numbers which sum is equal to the value.
    public boolean find(int value) {
        for(int i : set) {
            int j = value - i;
            if (j != i && set.contains(j) || j == i && dup.contains(i))
                return true;
        }
        return false;
    }
}


// Your TwoSum object will be instantiated and called as such:
// TwoSum twoSum = new TwoSum();
// twoSum.add(number);
// twoSum.find(value);
