package easy;
import java.util.List;
import java.util.ArrayList;

public class prob102 {
    
    private List<List<Integer>> trav;
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        trav = new ArrayList<List<Integer>>();
        traverse(root, 0);
        return trav;
    }
    
    private void traverse(TreeNode node, int depth) {
        if (node == null) return;
        while( trav.size() <= depth ) {
            trav.add(new ArrayList<Integer>());
        }
        trav.get(depth).add(node.val);
        traverse(node.left, depth + 1);
        traverse(node.right, depth + 1);
    }
    
}
