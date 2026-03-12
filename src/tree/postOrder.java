package tree;

public class postOrder {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }}
        public static void postorder(Node root){
            if(root==null) {

                return;}
            postorder(root.left);
            postorder(root.right);
            if(root.left!=null){ System.out.print(root.left.val+" ");}
else{
                System.out.print("null"+" ");
            }


            if(root.right!=null){ System.out.print(root.right.val+" ");}
else{
                System.out.print("null"+" ");
            }

            System.out.println(root.val);


        }

        public static void main(String[] args) {
            Node root =new Node(1);
            Node a=new Node(2);
            Node b=new Node(3);
            root.left=a;
            root.right=b;
            Node c=new Node(4);
            a.left=c;
            postorder(root);
        }
}
