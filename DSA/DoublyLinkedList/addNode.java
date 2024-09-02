package DSA.DoublyLinkedList;

public class addNode {
    void addNode(DLLNode head_ref, int pos, int data) {
        DLLNode temp = head_ref;
        DLLNode x= new DLLNode(data);
        for(int i=0; i<pos;i++){
            temp=temp.next;
        }
        x.prev=temp;
        x.next=temp.next;
        temp.next = x;
    }
}
