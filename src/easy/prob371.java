package easy;
// See http://www.geeksforgeeks.org/add-two-numbers-without-using-arithmetic-operators/
public class prob371 {
    public int getSum(int a, int b) {
        //While the carry is not 0
        while (b != 0) {
            
            //Calculate the carry bit by performing AND operation
            int carry = a & b;
            
            //Calculate the sum bit by performing XOR operation
            a = a ^ b;
            
            //Left shift the carry by 1 so adding it up with the sum yields the final result
            b = carry << 1;
            
        }
        return a;
    }
    
    public static void main(String[] args) {
        prob371 sol = new prob371();
        System.out.println(sol.getSum(5, 12));
    }
}
