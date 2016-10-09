package easy;

import java.util.LinkedList;
import java.util.List;

public class prob257 {
    List<String> list = new LinkedList<String>();
    int[] record = new int[10000];
    
    public List<String> binaryTreePaths(TreeNode root) {
        if (root != null) {
            helper(root, 0);
        }
        return list;
    }
    
    private void helper(TreeNode node, int depth) {
        if (node.left == null && node.right == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < depth; i++) {
                sb.append(record[i]).append("->");
            }
            sb.append(node.val);
            list.add(sb.toString());
        }
        else {
            record[depth] = node.val;
            if (node.left != null) helper(node.left, depth + 1);
            if (node.right != null) helper(node.right, depth + 1);
        }
    }
}
