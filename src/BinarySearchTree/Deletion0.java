package BinarySearchTree;


public class Deletion0 {
    class Node {
        Node left;
        Node right;
        int val;

        Node(int val) {
            this.val = val;
        }
    }

     Node create(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        if(root.val>val){
            root.left=create(root.left ,val);
        }
        else if(root.val<val){
            root.right=create(root.right ,val);
        }
        return root;
    }
    void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
    Node delete(Node root,int t){
        if(root==null) return null ;
        if(root.left==null && root.right==null && root.val==t){

            return null;
        }

        if(root.val>t) root.left=delete(root.left,t);
        else if(root.val<t) root.right= delete(root.right,t);
        return root;
    }
    public static void main(String[] args) {
      Deletion0 d=new Deletion0();
        int[]arr={12,45,2,3,8,67,10};
        Node root=null;
        for(int i=0;i<arr.length;i++){
           root= d.create(root,arr[i]);
        }

        int target=10;
       root= d.delete(root,target);
        d.inorder(root);

    }
}
