package easy;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class prob160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int stepA = 0;
        int stepB = 0;
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while (nodeA != null) {
            stepA++;
            nodeA = nodeA.next;
        }
        while (nodeB != null) {
            stepB++;
            nodeB = nodeB.next;
        }
        
        nodeA = headA;
        nodeB = headB;
        if (stepA > stepB) {
            for (int i = 0; i < stepA - stepB; i++)
                nodeA = nodeA.next;
        }
        else if (stepB > stepA) {
            for (int i = 0; i < stepB - stepA; i++)
                nodeB = nodeB.next;
        }
        while (nodeA != nodeB) {
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return nodeA;
    }
}
