package tree;

public class post2 {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }}
        public static void post(Node root){
           if(root ==null){
               System.out.print("null"+" ");
               return;
           }
           post(root.left);
           post(root.right);
            System.out.print(root.val+" ");
        }

        public static void main(String[] args) {
            Node root =new Node(1);
            Node a=new Node(2);
            Node b=new Node(3);
            root.left=a;
            root.right=b;
            Node c=new Node(4);
            a.left=c;
            post(root);
        }
}
