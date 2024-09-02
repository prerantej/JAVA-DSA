package DSA.DoublyLinkedList;

public class reverseDLL {
    // Method to reverse the doubly linked list
    public DLLNode reverseDLL(DLLNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        DLLNode last = null;
        DLLNode cur = head;
        while (cur != null) {
            last = cur.prev;
            cur.prev = cur.next;
            cur.next = last;
            cur = cur.prev;
        }
        return last.prev;  // last.prev will be the new head
    }

    // Helper method to print the doubly linked list
    void printDLL(DLLNode head) {
        DLLNode t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    // Method to construct the doubly linked list from an array
    DLLNode constructDLL(int arr[]) {
        int n = arr.length;
        if (n == 0) {
            return null;
        }
        DLLNode head = new DLLNode(arr[0]);
        DLLNode t = head;
        DLLNode q = null;
        for (int i = 1; i < n; i++) {
            t.next = new DLLNode(arr[i]);
            q = t;
            t = t.next;
            t.prev = q;
        }
        return head;
    }

    public static void main(String[] args) {
        // Test array to form a doubly linked list
        int[] arr = {1, 2, 3, 4, 5};

        // Create an instance of reverseDLL and form the DLL
        reverseDLL dll = new reverseDLL();
        DLLNode head = dll.constructDLL(arr);

        // Print the original doubly linked list
        System.out.print("Original Doubly Linked List: ");
        dll.printDLL(head);

        // Reverse the doubly linked list
        DLLNode reversedHead = dll.reverseDLL(head);

        // Print the reversed doubly linked list
        System.out.print("Reversed Doubly Linked List: ");
        dll.printDLL(reversedHead);
    }
}