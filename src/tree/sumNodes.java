package tree;

public class sumNodes {
    public static class Node{
        int val;
        Node left ;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    public static int sums(Node root , int sum){
        if(root == null) return sum;

        sum = sum + root.val;
        sum = sums(root.left , sum);
        sum = sums(root.right , sum);

        return sum;
    }
//    public static int sums(Node root){
//        if(root==null) return 0;
//
//        return root.val + sums(root.left) + sums(root.right);
//    }


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
        b.left=e;
        int sum=0;
        System.out.println(sums(root,sum));
    }
}
