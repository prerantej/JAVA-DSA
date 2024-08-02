package java_basics.BinaryTree;

import java.util.*;

public class levelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> inner = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                inner.add(node.val);

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            ans.add(inner);
        }
        return ans;
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(7);

        levelOrderTraversal solution = new levelOrderTraversal();
        List<List<Integer>> result = solution.levelOrder(root);

        // Print the result
        System.out.println("Level order traversal:");
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}
