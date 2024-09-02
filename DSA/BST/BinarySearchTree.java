package DSA.BST;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    Node insert(Node node,int key){
        if (node==null){
            Node newNode =new Node(key);
            return newNode;
        }
        if (key < node.key){
            node.left=insert(node.left,key);
        }
        else if (key > node.key){
            node.right=insert(node.right,key);
        }
        return node;
    }

    void inOrder(Node node){
        if(node == null){
            return;
        }

        inOrder(node.left);

        System.out.print(node.key + " ");

        inOrder(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTree tree= new BinarySearchTree();

        tree.root=tree.insert(tree.root,50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        tree.inOrder(tree.root);

    }

}
