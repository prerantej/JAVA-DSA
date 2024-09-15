package DSA.LinkedList;

public class flattenLL {

        // Function to flatten a linked list
        public static Node flatten(Node root) {
            if (root == null || root.next == null) {
                return root;
            }

            // Flatten the rest of the list
            Node mergedNode = flatten(root.next);

            // Merge current list (root) with the flattened list
            return merge(root, mergedNode);
        }

        public static Node merge(Node n1, Node n2) {
            Node dummy = new Node(0);
            Node res = dummy;

            while (n1 != null && n2 != null) {
                if (n1.data < n2.data) {
                    res.bottom = n1;
                    res = n1;
                    n1 = n1.bottom;
                } else {
                    res.bottom = n2;
                    res = n2;
                    n2 = n2.bottom;
                }
                res.next = null;
            }

            if (n1 != null) {
                res.bottom = n1;
            } else {
                res.bottom = n2;
            }

            return dummy.bottom;
        }
    }


