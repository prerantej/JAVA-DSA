package DSA.LinkedList;

class deleteNode {
    // Function to delete a node given only access to that node
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            throw new IllegalArgumentException("Node to be deleted cannot be null or the last node.");
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        // Create a sample linked list
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = constructLL(arr);

        // Print the linked list before deletion
        System.out.print("Original list: ");
        printList(head);

        // Initialize the deleteNode object and delete a node
        deleteNode solution = new deleteNode();

        // Example: Delete node with value 3
        ListNode nodeToDelete = head.next.next; // Node with value 3
        solution.deleteNode(nodeToDelete);

        // Print the linked list after deletion
        System.out.print("List after deletion: ");
        printList(head);
    }

    // Helper method to construct a linked list from an array
    static ListNode constructLL(int arr[]) {
        if (arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    // Helper method to print the linked list
    static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}


