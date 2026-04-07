public class postorderInTree2 {
    class Node{
        char data;
        Node left;
        Node right;

        Node(char data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");  
    }

    public static void main(String[] args) {
        postorderInTree2 tree = new postorderInTree2();
        Node root = tree.new Node('A');

        root.left = tree.new Node('B');
        root.right = tree.new Node('C');

        root.left.left = tree.new Node('D');
        root.left.right = tree.new Node('E');

        root.right.left = tree.new Node('G');
        root.right.right = tree.new Node('H');

        root.left.right.left = tree.new Node('I');
        root.left.right.right = tree.new Node('J');

        root.right.left.left = tree.new Node('K');

        System.out.println("Postorder Traversal:");
        tree.postorder(root);
    }
}
