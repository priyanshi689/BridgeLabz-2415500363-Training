public class inorderInTree2 {
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
    void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        inorderInTree2 tree = new inorderInTree2();
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

        System.out.println("Inorder Traversal:");
        tree.inorder(root);
    }
    
}
