package DSA.LinkedList;

public class addOneAtLast {
        public Node reverse(Node head){
            Node prev=null;
            Node cur=head;
            Node next=null;
            while(cur!=null){
                next=cur.next;
                cur.next=prev;
                prev=cur;
                cur=next;
            }
            return prev;
        }

        public Node addOne(Node head) {
            head= reverse(head);

            Node temp=head;
            int carry=1;

            while(temp!=null){
                if(carry>0){
                    int sum=temp.data+carry;
                    temp.data=sum%10;;
                    carry=sum/10;
                }
                if(carry==0){
                    break;
                }
                if(temp.next==null && carry>0){
                    temp.next=new Node(carry);
                    carry=0;
                }
                temp=temp.next;
            }

            return reverse(head);
        }
    }


