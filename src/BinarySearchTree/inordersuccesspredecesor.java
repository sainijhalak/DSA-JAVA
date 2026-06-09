package BinarySearchTree;
import java.util.*;
public class inordersuccesspredecesor {
    public static class Node{
       Node left,right;
        int val;
        Node(int val){
            this.val=val;
        }
    }
    static Node create(Node root, int val)
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
    static void inorder(Node root,List<Integer>list){
        if(root==null) return;
        inorder(root.left,list);
       list.add(root.val);
        inorder(root.right,list);
    }

    public static void main(String[] args) {
        int[]arr={10,34,5,2,32,56,9};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=create(root,arr[i]);
        }
        int n=5;
        List<Integer>list=new ArrayList<>();
        inorder(root,list);
        for(int i=0;i<list.size();i++){
            if(list.get(i)==n){
                System.out.println(list.get(i-1) +" "+ list.get(i+1));
            }
        }
    }
}
