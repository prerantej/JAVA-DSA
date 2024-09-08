package DSA.LinkedList;

class NthEndNode{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to handle edge cases (like removing the head node)
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Initialize two pointers, both starting from the dummy node
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move the fast pointer n+1 steps ahead to maintain a gap of n between fast and slow
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end of the list
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Now, slow is just before the node to be removed
        // Remove the nth node
        slow.next = slow.next.next;

        // Return the modified list starting from the original head
        return dummy.next;
    }
}
