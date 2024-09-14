package DSA.DoublyLinkedList;

public class deleteAllOcurrences {
        static DLLNode deleteAllOccurOfX(DLLNode head, int x) {
            DLLNode dummy = new DLLNode(0);
            dummy.next = head;
            if (head != null) {
                head.prev = dummy;
            }
            DLLNode cur = head;
            DLLNode prev = dummy;

            while (cur != null) {
                if (cur.data == x) {
                    prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = prev;
                    }
                    cur = prev.next;
                } else {
                    prev = cur;
                    cur = cur.next;
                }
            }
            return dummy.next;
        }
    }


