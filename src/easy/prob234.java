package easy;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class prob234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int n = list.size();
        for (int i = 0; i < n; i++) {
            if (!list.get(i).equals(list.get(n-1-i)))
                return false;
        }
        return true;
    }
}
