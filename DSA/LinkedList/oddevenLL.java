package DSA.LinkedList;

public class oddevenLL {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd=head;
        ListNode oddHead=head;
        ListNode even=head.next;
        ListNode evenHead=head.next;
        while(odd != null && even != null && even.next != null){
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return oddHead;
    }
}
