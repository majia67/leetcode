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
public class prob104 {
    public int maxDepth(TreeNode root) {
        return helper(root, 0);
    }
    
    private int helper(TreeNode cur, int depth) {
        if (cur != null) {
            return Math.max(helper(cur.left, depth + 1), helper(cur.right, depth + 1));
        }
        else {
            
            return depth;
        }
    }
}
