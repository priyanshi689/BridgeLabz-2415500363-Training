public class BST{
        static class Node{
            int data;
            Node left;
            Node right;
    
            public Node(int data){
                this.data=data;
                this.left=null;
                this.right=null;
            }
        }
        void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    


    public static Node insert(Node root,int data){
        if(root == null){
           
          Node newNode=new Node(data);
            return newNode;
        }

        if(data<root.data){
            root.left=insert(root.left,data);   
        }
        if(data>root.data){
            root.right=insert(root.right,data);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root=null;

        int[] values={50,30,20,40,70,60,80};

        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        System.out.println("Inorder Traversal:");
        BST tree=new BST();
        tree.inorder(root);
    }
}