package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class levelOrderUsingQueue {

        public static class Node{
            int val;
            Node left;
            Node right;

            Node(int val){
                this.val = val;
            }
        }




        public static void levelQorder(Node root){
            Queue <Node> q=new LinkedList<>();
            if(root!=null) q.add(root);
            while(!q.isEmpty()){
                Node cur=q.poll();
                System.out.print(cur.val);
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
                
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

            levelQorder(root);


        }
}
