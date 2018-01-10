
package bst;
public class BST {

    /**
     * @param args the command line arguments
     */
    class Node{
        int key;
        Node left,right;
        Node(int key){
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }
    Node root;
    BST(){
        this.root = null;
    }
    void insert(int data){
        root = insertInto(root,data);
    }
    Node insertInto(Node root, int data){
        if( root !=null  && root.key <data){
            root.right = insertInto(root.right, data);
        }
        else if( root !=null  && root.key > data){
            root.left = insertInto(root.left, data);
        }
        else{
            Node temp = new Node(data);
            root = temp;
            
        }
        return root;
    }
    void inOrder(){
        inOrderTree(root);
    }
    void inOrderTree(Node root){
        if(root == null) return;
        if(root.left != null) inOrderTree(root.left);
        System.out.println(root.key);
        if(root.right != null) inOrderTree(root.right);
    }
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inOrder();
    }
    
}
