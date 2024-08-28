package java_basics.LinkedList;

class insertAtEnd {
    // Function to insert a node at the end of the linked list.
    static Node insertAtEnd(Node head, int x) {
        if (head == null) {
            return new Node(x);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        return head;
    }

    public static void main(String[] args) {
        // Test with a sample linked list and value to insert
        int[] arr = {1, 2, 3, 4, 5};
        Node head = constructLL(arr); // Assuming constructLL method is available

        // Print the linked list before insertion
        System.out.print("Original list: ");
        printList(head);

        // Insert value at the end
        head = insertAtEnd(head, 6);

        // Print the linked list after insertion
        System.out.print("List after insertion: ");
        printList(head);
    }

    // Helper method to print the linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Assuming the Node class and constructLL method are defined elsewhere
    static Node constructLL(int arr[]) {
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
}
