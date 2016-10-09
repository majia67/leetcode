package easy;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class prob237 {
    public void deleteNode(ListNode node) {
        if (node.next == null) return;
        while (node.next.next != null) {
            node.val = node.next.val; 
            node = node.next;
        }
        node.val = node.next.val;
        node.next = null;
    }
}
