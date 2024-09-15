package DSA.DoublyLinkedList;

public class removeDuplicatesDLL {
        Node removeDuplicates(Node head){
            // Code Here.
            if(head == null) return head;
            Node tmp = head;

            while(tmp.next != null){
                if(tmp.data == tmp.next.data){

                    Node nextNode = tmp.next.next;
                    tmp.next = nextNode;

                    if (nextNode != null) {
                        nextNode.prev = tmp;
                    }

                }
                else{
                    tmp = tmp.next;
                }
            }
            return head;

        }

    }

