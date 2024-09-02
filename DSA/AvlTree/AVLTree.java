package DSA.AvlTree;

public class AVLTree {
    TreeNode root;


    int height(TreeNode node) {
        if (node == null)
            return 0;
        return node.height;
    }


    int max(int a, int b) {
        return Math.max(a, b);
    }

    int updateheight(TreeNode node){
        return node.height=max(height(node.left),height(node.right))+1;
    }

    TreeNode rightRotate(TreeNode y) {
        TreeNode x = y.left;
        TreeNode T2 = x.right;

        x.right = y;
        y.left = T2;

        updateheight(y);
        updateheight(x);

        return x;
    }


    TreeNode leftRotate(TreeNode x) {
        TreeNode y = x.right;
        TreeNode T2 = y.left;

        y.left = x;
        x.right = T2;

        updateheight(x);
        updateheight(y);

        return y;
    }


    int getBalance(TreeNode node) {
        if (node == null)
            return 0;
        return height(node.left) - height(node.right);
    }

    TreeNode insert(TreeNode node, int value) {

        if (node == null)
            return (new TreeNode(value));

        if (value < node.value)
            node.left = insert(node.left, value);
        else if (value > node.value)
            node.right = insert(node.right, value);
        else // Duplicate values not allowed
            return node;

        updateheight(node);


        int balance = getBalance(node);


        // Left Left Case
        if (balance > 1 && value < node.left.value)
            return rightRotate(node);

        // Right Right Case
        if (balance < -1 && value > node.right.value)
            return leftRotate(node);

        // Left Right Case
        if (balance > 1 && value > node.left.value) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && value < node.right.value) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }


        return node;
    }


    void  inOrder(TreeNode node){
        if(node == null){
            return;
        }

        inOrder(node.left);

        System.out.print(node.value + " ");

        inOrder(node.right);
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();


        int[] values = {14, 17, 11, 7, 53, 4, 13, 12, 8, 60, 19, 16, 20};
        for (int value : values) {
            tree.root = tree.insert(tree.root, value);
        }

        System.out.println("Inorder traversal of constructed tree is: ");
        tree.inOrder(tree.root);
    }
}
