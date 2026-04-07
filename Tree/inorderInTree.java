public class inorderInTree {

    // Node class
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Inorder Traversal: Left -> Root -> Right
    void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        inorderInTree tree = new inorderInTree();

        // Creating root
        Node root = tree.new Node(10);

        // LEFT SUBTREE
        root.left = tree.new Node(15);
        root.left.left = tree.new Node(30);
        root.left.right = tree.new Node(40);
        root.left.right.left = tree.new Node(70);
        root.left.right.right = tree.new Node(80);

        // RIGHT SUBTREE
        root.right = tree.new Node(20);
        root.right.left = tree.new Node(50);
        root.right.left.right = tree.new Node(90);
        root.right.right = tree.new Node(60);

        // Traversal
        System.out.println("Inorder Traversal:");
        tree.inorder(root);
    }
}