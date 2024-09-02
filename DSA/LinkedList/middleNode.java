package DSA.LinkedList;

public class middleNode {
    public ListNode middleNode(ListNode head) {
        // brute force
        //     int count=1;
        //     ListNode temp=head;
        //     while(temp!=null){
        //         count++;
        //     }
        //     int data=head.val;
        //     int mid=count/2;
        //     ListNode temp1=head;
        //     for(int i=0;i<mid;i++){
        //         temp1=temp1.next;
        //     }
        //     return temp1;
        // }
        // optimal using slow and fast pointers
        if(head==null){
            return head;
        }
        ListNode slow= head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
    public void printListFrom(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Test array to form a linked list
        int[] arr = {1, 2, 3, 4, 5, 6};

        // Create an instance of constructLL from LinkedList package to construct the linked list
        constructLL constructor = new constructLL();
        ListNode head = constructor.constructLL(arr); // Use constructLL to create the linked list

        // Create an instance of middleNode to find the middle node
        middleNode mn = new middleNode();

        // Find the middle node
        ListNode middle = mn.middleNode(head);

        // Print the linked list starting from the middle node
        System.out.print("Middle node onwards: ");
        mn.printListFrom(middle);
    }
}
