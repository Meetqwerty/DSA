class Node{
int data;
Node left;
Node right;
Node(int data){
    this.data=data;
    this.left=null;
    this.right=null;
}};
public class bst{
    Node root;
    public void create(int data,Node rootNode){
        if(root==null){
            Node newnode=new Node(data);
            root = newnode;
        }else{
            if(rootNode.data>data){
                rootNode.left=new Node(data);
            }
            else if(rootNode.data < data){
                rootNode.right=new Node(data);
            }
            else {
                System.out.println("Duplicate data not allowed");
            }
        }
    }public void display(Node rootNode){
        if(rootNode==null){
            System.out.println("Tree is empty");
        }else{
            System.out.println(" "+rootNode.data);
            System.out.println ("L   R");
            System.out.println(rootNode.left.data+"  "+rootNode.right.data);
        }
    }
    public static void main(String[] args) {
    bst tree=new bst();
    tree.create(10,tree.root);  
    tree.create(5,tree.root);
    tree.create(15,tree.root);
    tree.display(tree.root);
    }
}