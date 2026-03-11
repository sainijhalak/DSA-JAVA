package tree;

public class minT {
    public static class Node{
        int val;
        Node left ;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
      public static int mins(Node root){
          if(root==null) return Integer.MAX_VALUE;
          return Math.min(root.val,Math.min(mins(root.left),mins(root.right)));
      }
    public static void main(String[] args) {
        Node root=new Node(-2);
        Node a=new Node(-4);
        Node b=new Node(-10);
        root.left=a;
        root.right=b;
       Node c=new Node(-6);
        Node d=new Node(-15);
        a.left=c;
        a.right=d;

      Node e=new Node(-11);
        b.left=e;
        System.out.println(mins(root));
    }
}
