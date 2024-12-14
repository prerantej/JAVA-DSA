package DSA.LinkedList;

public class InsertAtBegining {
    static Node insertAtBegin(Node head, int x){
        Node newNode = new Node(x);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        return head;
    }
}
