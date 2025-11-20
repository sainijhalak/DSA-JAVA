package Linkedlist;
public class LinkedList1 {
    public static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
        }

    }

    public static void main(String[] args) {
        Node a=new Node(1);
//        System.out.println(a.data);
//        System.out.println(a);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(a.next);
        System.out.println(b);
        System.out.println(c.data);

    }
}
