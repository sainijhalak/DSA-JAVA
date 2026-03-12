package tree;

public class diametert {

        public static class Node{
            int val;
            Node left;
            Node right;

            Node(int val){
                this.val = val;
            }
        }




        public static int height(Node root){

                if(root == null) return 0;

                return 1 + Math.max(height(root.left), height(root.right));

        }
        static int ans=0;
        public static void diameter(Node root){
            if (root==null) return ;

            int l=height(root.left);
            int r=height(root.right);
            ans=Math.max(ans,l+r);
         diameter(root.left);
            diameter(root.right);



        }

        public static void main(String[] args) {

            Node root = new Node(4);

            Node a = new Node(-7);
            Node b = new Node(-3);
            root.left = a;
            root.right = b;

            // -7 children null

            Node c = new Node(-9);
            Node d = new Node(-3);
            b.left = c;
            b.right = d;

            Node e = new Node(9);
            Node f = new Node(-7);
            c.left = e;
            c.right = f;

            Node g = new Node(-4);
            d.left = g;

            Node h = new Node(6);
            f.left = h;

            Node i = new Node(-6);
            Node j = new Node(-6);
            g.left = i;
            g.right = j;

            Node k = new Node(0);
            Node l = new Node(6);
            i.left = k;
            i.right = l;

            Node m = new Node(5);
            j.left = m;

            Node n = new Node(9);
            l.left = n;

            Node o = new Node(-1);
            Node p = new Node(-4);
            n.left = o;
            n.right = p;

            Node q = new Node(-2);
            p.right = q;

            diameter(root);
            System.out.println(ans);


        }
}
