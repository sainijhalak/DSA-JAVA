package tree;

public class hieghtT {
    public static class Node{
        int val;
        Node left ;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
//       public static int hieghttree(Node root){
//        if(root==null) return 0;
//return 1+ Math.max(hieghttree(root.left),hieghttree(root.right));
//}
    public static int hieghttree(Node root){
        if(root==null) return -1;
        return 1+ Math.max(hieghttree(root.left),hieghttree(root.right));
    }
    public static void main(String[] args) {
        Node root=new Node(2);
        Node a=new Node(4);
        Node b=new Node(10);
        root.left=a;
        root.right=b;
       Node c=new Node(6);
        Node d=new Node(5);
        a.left=c;
        a.right=d;

      Node e=new Node(11);
        Node f=new Node(11);
        b.left=e;
      e.left=f;
      int n=hieghttree(root);
        System.out.println(n);
    }
}
