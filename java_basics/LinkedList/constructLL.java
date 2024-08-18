package java_basics.LinkedList;

class constructLL {
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

    public static void main(String[] args) {
        // Test with a sample array
        int[] arr = {1, 2, 3, 4, 5};

        // Construct the linked list
        Node head = constructLL(arr);

        // Print the linked list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

