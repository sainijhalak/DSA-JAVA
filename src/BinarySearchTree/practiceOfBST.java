package BinarySearchTree;

public class practiceOfBST {
    public static class Node{
        Node left,right;
        int val;
        Node(int val){
            this.val=val;
        }
    }
      static Node create(Node root,int val)
      {
          if(root==null) return new Node(val);
          if(val<root.val){
              root.left= create(root.left,val);
          }
          else if(val>root.val){
              root.right=create(root.right,val);
          }
          return root;
      }
      static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
          System.out.println(root.val);
          inorder(root.right);
      }
      static void delete(Node root,int t){

      }
    public static void main(String[] args) {
        int[]arr={10,34,5,32,56,9};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=create(root,arr[i]);
        }
        delete(root,32);
        inorder(root);
    }
}
