package DSA.LinkedList;

public class cloneRandomLL {
        public Node copyRandomList(Node head) {
            Node temp= head;
            while(temp!=null){
                Node copyNode=new Node(temp.data);
                copyNode.next=temp.next;
                temp.next=copyNode;
                temp=temp.next.next;
            }
            temp=head;
            while(temp!=null){
                Node nextNode = temp.next;
                if(temp.random!=null){
                    nextNode.random=temp.random.next;
                }
                else{
                    nextNode.random=null;
                }
                temp=temp.next.next;
            }
            temp=head;
            Node dummy=new Node(0);
            Node res=dummy;
            while(temp!=null){
                res.next=temp.next;
                temp.next=temp.next.next;
                temp=temp.next;
                res=res.next;
            }
            return dummy.next;
        }
    }
//basically you need to insert new nodes in between
// then connect random points
// then extract the cloned ll using dummy node

