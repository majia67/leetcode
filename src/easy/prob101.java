package easy;

public class prob101 {
    
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    
    public boolean isMirror(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) return true;
        if (r1 == null || r2 == null) return false;
        return (r1.val == r2.val)
            && isMirror(r1.left, r2.right) 
            && isMirror(r1.right, r2.left);
    }
    
}
