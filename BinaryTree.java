class Node {
    int key;
    Node left, right;

    public Node(int value) {
        this.key = value;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    void printInOrder(Node node) {

        if (node == null) {
            return;
        }

        printInOrder(node.left); //recursion on the left

        System.out.print(node.key + " ");

        printInOrder(node.right); //recursion on the right

    }

    // Wrappers over above recursive functions
    void printInOrder() { 
        printInOrder(root); 
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(76);
        tree.root.right.right = new Node(44);

        System.out.println("InOrder traversal of binary tree: ");
        tree.printInOrder();
    }

}
