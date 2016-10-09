package easy;

public class prob019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        
        if (count - n > 0) {
            node = head;
            for (int i = 0; i < count-n-1; i++) {
                node = node.next;
            }
            ListNode next = node.next;
            node.next = next.next;
            next.next = null;            
        }
        else {
            head = head.next;
        }
        return head;
    }
}
