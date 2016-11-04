/*
117. Populating Next Right Pointers in Each Node II
Follow up for problem "Populating Next Right Pointers in Each Node".

What if the given tree could be any binary tree? Would your previous solution still work?

Note:

You may only use constant extra space.
For example,
Given the following binary tree,
         1
       /  \
      2    3
     / \    \
    4   5    7
    
After calling your function, the tree should look like:
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \    \
    4-> 5 -> 7 -> NULL
 */

package hard;
/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Prob117_Populating_Next_Right_Pointers_in_Each_Node_II {
    private TreeLinkNode head, tail;
    
    public void connect(TreeLinkNode root) {
        TreeLinkNode cur = root;
        while (cur != null) {
            head = null;
            tail = null;
            for (; cur != null; cur = cur.next) {
                visit(cur.left);
                visit(cur.right);
            }
            cur = head;    // shift to the next level;
        }
    }
    
    private void visit(TreeLinkNode node) {
        if (node == null) {
            return;
        }
        if (head == null) {
            head = node;
        }
        if (tail == null) {
            tail = node;
        }
        else {
            tail.next = node;
            tail = tail.next;
        }
    }
}
