package DSA.DoublyLinkedList;

public class constructDLL {
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
    void printDLL(DLLNode head) {
        DLLNode t = head;
        System.out.print("Doubly Linked List: ");
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Test array to form a doubly linked list
        int[] arr = {1, 2, 3, 4, 5};

        // Create an instance of constructDLL and form the DLL
        constructDLL dll = new constructDLL();
        DLLNode head = dll.constructDLL(arr);

        // Print the resulting doubly linked list
        dll.printDLL(head);
    }
}
