package easy;

public class prob111 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return helper(root, 1);
    }
    
    private int helper(TreeNode node, int depth) {
        if (node.left == null && node.right == null) return depth;
        else if (node.left != null && node.right != null)
            return Math.min(helper(node.left, depth + 1), helper(node.right, depth + 1));
        else if (node.left != null)
            return helper(node.left, depth + 1);
        else
            return helper(node.right, depth + 1);
    }
}
