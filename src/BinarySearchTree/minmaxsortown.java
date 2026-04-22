package BinarySearchTree;
import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int val;
    Node(int val){
        this.val=val;
    }
}
class operations{
    Node create(Node root,int val){
        if(root==null){
            return new Node (val);
        }
        if(val<root.val) {
            root.left= create(root.left,val);
        }
        else{
            root.right= create(root.right,val);
        }
        return root;
    }
    void inorder(Node root){
        if (root==null) return ;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
    int min(Node root,int min){
        if(root==null) return min;
        min=Math.min(min,root.val);
       min= min(root.left,min);
        return min;
    }


}
public class minmaxsortown {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        operations op=new operations();
        int n=5;
        Node root= null;
        int[]arr={72,94,56,78,2};
        for(int i=0;i<n;i++){
            root=op.create(root,arr[i]);
        }
//        op.inorder(root);
//        int max=Integer.MAX_VALUE;
//        System.out.println(op.min(root,max));
    }
}
