package medium;

public class prob002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        ListNode temp = new ListNode(0);
        ListNode result = temp;
        while (l1 != null || l2 != null) {
            if (l1 != null) { sum += l1.val; l1 = l1.next; }
            if (l2 != null) { sum += l2.val; l2 = l2.next; }
            temp.next = new ListNode(sum % 10);
            sum /= 10;
            temp = temp.next;
        }
        if (sum != 0) { temp.next = new ListNode(sum); }
        result = result.next;
        return result;
    }
}
