package easy;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class prob024 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode cur = new ListNode(0);
        cur.next = head;
        head = cur;
        while (cur.next != null && cur.next.next != null) {
            System.out.println(cur.val);
            ListNode copy = cur.next.next;
            cur.next.next = copy.next;
            copy.next = cur.next;
            cur.next = copy;
            cur = copy.next;
        }
        return head.next;
    }
    
    public static void main(String[] args) {
        prob024 test = new prob024();
        ListNode t = new ListNode(1);
        ListNode head = t;
        for (int i = 2; i < 5; i++) {
            t.next = new ListNode(i);
            t = t.next;
        }
        test.swapPairs(head);
    }
}
