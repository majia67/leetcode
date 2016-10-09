package easy;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class prob021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode re = new ListNode(0);
        ListNode head = re;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                re.next = new ListNode(l1.val);
                l1 = l1.next;                
            }
            else {
                re.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            re = re.next;
        }
        ListNode rest = l1 == null ? l2 : l1;
        while (rest != null) {
            re.next = new ListNode(rest.val);
            rest = rest.next;
            re = re.next;
        }
        return head.next;
    }
}
