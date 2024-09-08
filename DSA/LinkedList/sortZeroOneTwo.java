package DSA.LinkedList;

public class sortZeroOneTwo {
        // Function to sort a linked list of 0s, 1s and 2s.
        static Node segregate(Node head) {
            Node zero= new Node(0);
            Node one= new Node(0);
            Node two= new Node(0);

            Node zeroHead= zero;
            Node oneHead= one;
            Node twoHead= two;

            Node temp=head;
            while(temp!=null){
                if(temp.data==0){
                    zero.next=temp;
                    zero=temp;
                }
                else if(temp.data==1){
                    one.next=temp;
                    one=temp;
                }
                else{
                    two.next=temp;
                    two=temp;
                }
                temp=temp.next;
            }

            zero.next=oneHead.next != null ? oneHead.next: twoHead.next;
            one.next=twoHead.next;
            two.next=null;

            return zeroHead.next;
        }
    }

