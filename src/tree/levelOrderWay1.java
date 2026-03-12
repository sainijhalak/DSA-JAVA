package tree;
import java.util.*;

// Using List
public class levelOrderWay1 {

    public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    public static void orderLevel(Node root){

        List<Node> clist = new ArrayList<>();
        clist.add(root);

        int k = 0;

        while(!clist.isEmpty()){

            List<Node> nlist = new ArrayList<>();
            System.out.print("level " + k + ": ");
            for(Node i : clist){


                System.out.print(i.val+" ");
                if(i.left != null)
                    nlist.add(i.left);

                if(i.right != null)
                    nlist.add(i.right);
            }
            System.out.println();
            k++;
            clist = nlist;
        }
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

        orderLevel(root);
    }
}