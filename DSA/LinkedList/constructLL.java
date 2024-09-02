package DSA.LinkedList;

import DSA.LinkedList.constructLL;

class constructLL {
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

    public static void main(String[] args) {
        // Test with a sample array
        int[] arr = {1, 2, 3, 4, 5};

        // Construct the linked list
        ListNode head = constructLL(arr);

        // Print the linked list
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}

