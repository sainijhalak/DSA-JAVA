package tree;
import java.util.*;
public class sameTree {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    public static void t1pre(Node t1 , List<String> l1){
        if(t1==null) {
            l1.add("null");
            return;
        }
        l1.add(String.valueOf(t1.val));
        t1pre(t1.left,l1);
        t1pre(t1.right,l1);

    }
    public static void t2pre(Node t2 , List<String> l2){
        if(t2==null) {
            l2.add("null");
            return;
        }
        l2.add(String.valueOf(t2.val));
        t2pre(t2.left,l2);
        t2pre(t2.right,l2);

    }

    public static void main(String[] args) {
        //t1
        Node t1=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        t1.left=a;
        t1.right=b;
        //t2
        Node t2=new Node(1);
        Node d=new Node(2);
        Node e=new Node(3);
        t2.left=d;
        t2.right=e;
        List<String> l1=new ArrayList<>();
        List<String> l2=new ArrayList<>();
        t1pre(t1,l1);
        t2pre(t2,l2);
        System.out.println(l1.equals(l2));

    }
}
