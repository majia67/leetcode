package easy;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class prob206 {
    public ListNode reverseList(ListNode head) {
        ListNode revHead = new ListNode(0);
        ListNode revCur = revHead;
        ListNode cur = head;
        while(cur != null) {
            revCur = new ListNode(cur.val);
            revCur.next = revHead.next;
            revHead.next = revCur;
            cur = cur.next;
        }
        return revHead.next;
    }
}
