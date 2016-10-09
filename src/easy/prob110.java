package easy;

public class prob110 {
    
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        else {
            int left = depth(root.left, 0);
            int right = depth(root.right, 0);
            if (Math.abs(left - right) > 1)
                return false;
            else
                return isBalanced(root.left) && isBalanced(root.right);
        }
    }
    
    private int depth(TreeNode root, int depth) {
        if (root == null)
            return depth;
        else {
            return Math.max(depth(root.left, depth + 1), depth(root.right, depth + 1));
        }
    }
    
}
