package easy;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class prob270 {
    
    public int closestValue(TreeNode root, double target) {
        double minDiff = Double.MAX_VALUE;
        int minNodeVal = root.val;
        while (root != null) {
            double diff = Math.abs(root.val - target);
            if (diff < minDiff) { 
                minDiff = diff;
                minNodeVal = root.val;
            }
            if (target < root.val) root = root.left;
            else root = root.right;
        }
        return minNodeVal;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
