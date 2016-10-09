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
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class prob107 {

    private List<List<Integer>> result;

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        result = new ArrayList();
        helper(root, 0);
        Collections.reverse(result);
        return result;
    }

    private void helper(TreeNode cur, int depth) {
        if (cur == null)
            return;
        if (depth >= result.size()) {
            result.add(new LinkedList<Integer>());
        }
        List<Integer> lst = result.get(depth);
        lst.add(cur.val);
        helper(cur.left, depth + 1);
        helper(cur.right, depth + 1);
    }

}
