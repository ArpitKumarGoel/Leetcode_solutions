
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        tail.next = head;
        k = k % length;
        int stepsToNewTail = length - k;
        
        ListNode newTail = tail; 
        while (stepsToNewTail > 0) {
            newTail = newTail.next;
            stepsToNewTail--;
        }
        head = newTail.next;
        newTail.next = null;
        
        return head;
    }
}
