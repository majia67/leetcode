package easy;

public class prob203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        ListNode previous = null;
        while (current != null) {
            while (current != null && current.val != val) {
                previous = current;
                current = current.next;
            }
            if (current != null) {
                if (current == head) {
                    head = head.next;
                    current.next = null;
                    current = head;
                }
                else {
                    previous.next = current.next;
                    current.next = null;
                    current = previous.next;
                }
            }
        }
        return head;
    }
}
