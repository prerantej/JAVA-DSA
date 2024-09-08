package DSA.LinkedList;

public class SortLinkedList {
    public ListNode findMiddle(ListNode h){
        if (h == null || h.next == null) {
            return h;
        }
        ListNode slow=h;
        ListNode fast=h.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public ListNode mergeList(ListNode left,ListNode right) {
        ListNode dummy= new ListNode(0);
        ListNode temp=dummy;

        while(left!=null && right!=null){
            if(left.val<=right.val){
                temp.next=left;
                left=left.next;
            }
            else{
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }
        if(left!=null){
            temp.next=left;
        }
        else{
            temp.next=right;
        }
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode middle=findMiddle(head);

        ListNode right=middle.next;
        middle.next=null;
        ListNode left=head;

        left=sortList(left);
        right=sortList(right);

        return mergeList(left,right);
    }

}

