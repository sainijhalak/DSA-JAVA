package tree;

public class inOrder {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }}
        public static void in(Node root){
            if(root==null){
                System.out.print("null"+" ");
                return;
            }
            in(root.left);
            System.out.print(root.val+" ");
            in(root.right);


        }

        public static void main(String[] args) {
            Node root =new Node(1);
            Node a=new Node(2);
            Node b=new Node(3);
            root.left=a;
            root.right=b;
            Node c=new Node(4);
            a.left=c;
            in(root);
        }
}
