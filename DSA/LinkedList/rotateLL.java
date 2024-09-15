package DSA.LinkedList;

public class rotateLL {
        public ListNode rotateRight(ListNode head, int k) {
            if(head==null || head.next==null || k==0){
                return head;
            }
            ListNode temp=head;
            ListNode tail=temp;
            int count=0;
            while(temp!=null ){
                if(temp!=null){
                    tail=temp;
                }
                count++;
                temp=temp.next;
            }
            temp=head;
            k=k%count;
            if(k==0){
                return head;
            }
            for(int i =1; i<=count-k-1;i++){
                temp=temp.next;
            }
            ListNode head2=temp.next;
            temp.next=null;
            tail.next=head;
            return head2;
        }
    }

