package DSA.LinkedList;

public class searchKey {
    // Function to search for a key in the linked list
    static boolean searchKey(Node head, int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        // Create a sample linked list
        int[] arr = {1, 2, 3, 4, 5};
        Node head = constructLL(arr);

        // Test searching for various keys
        int keyToSearch1 = 3;
        int keyToSearch2 = 6;

        // Search for the keys and print the results
        System.out.println("Searching for " + keyToSearch1 + ": " + searchKey(head, keyToSearch1));
        System.out.println("Searching for " + keyToSearch2 + ": " + searchKey(head, keyToSearch2));
    }
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


