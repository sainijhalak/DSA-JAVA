package tree;
//using recursion
public class levelOrderTway2 {




        public static class Node{
            int val;
            Node left;
            Node right;

            Node(int val){
                this.val = val;
            }
        }

        // height of tree
        public static int height(Node root){
            if(root == null) return 0;

            return 1 + Math.max(height(root.left), height(root.right));
        }

        // print nodes at nth level
        public static void nthLevel(Node root, int n){
if (root==null) return;
if(n==1){ System.out.print(root.val); return;}
nthLevel(root.left,n-1);
nthLevel(root.right,n-1);

        }

        public static void main(String[] args) {

            Node root = new Node(1);
            Node a = new Node(2);
            Node b = new Node(3);

            root.left = a;
            root.right = b;

            Node c = new Node(4);
            Node d = new Node(5);
            Node e = new Node(6);
            Node f = new Node(7);

            a.left = c;
            a.right = d;
            b.left = e;
            b.right = f;

            int h = height(root);
          for(int i=0;i<=h;i++){
              nthLevel(root,i);
              System.out.println();
          }


        }
    }

