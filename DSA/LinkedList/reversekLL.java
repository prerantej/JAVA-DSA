package DSA.LinkedList;

public class reversekLL {
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode temp=head;
            ListNode prevLast=null;

            while(temp!=null){
                ListNode kthNode= getKthNode( temp,k);
                if(kthNode==null){
                    if(prevLast!=null){
                        prevLast.next=temp;
                    }
                    break;
                }
                ListNode nextNode=kthNode.next;
                kthNode.next=null;
                reverseLL(temp);

                if(head==temp){
                    head=kthNode;
                }
                else{
                    prevLast.next=kthNode;
                }

                prevLast=temp;
                temp=nextNode;

            }
            return head;
        }
        public ListNode getKthNode(ListNode head , int k){
            k-=1;
            ListNode temp=head;
            while(k>0 && temp != null){
                k--;
                temp=temp.next;
            }
            return temp;
        }
        public ListNode reverseLL(ListNode head){
            ListNode temp=head;
            ListNode prev=null;

            while(temp!=null){
                ListNode front=new ListNode(0);
                front=temp.next;
                temp.next=prev;
                prev=temp;
                temp=front;
            }
            return prev;
        }
    }

