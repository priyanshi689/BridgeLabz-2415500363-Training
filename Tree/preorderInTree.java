public class preorderInTree {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

     public static void main(String[] args) {
        preorderInTree tree = new preorderInTree();
        Node root = tree.new Node(10);

        root.left = tree.new Node(15);
        root.right = tree.new Node(20);

        root.left.left = tree.new Node(30);
        root.left.right = tree.new Node(40);
        root.right.left = tree.new Node(50);
        root.right.right = tree.new Node(60);

        root.left.right.left = tree.new Node(70);
        root.left.right.right = tree.new Node(80);   
        root.right.left.right = tree.new Node(90);

        System.out.println("Preorder Traversal:");
        tree.preorder(root);
    }
}
