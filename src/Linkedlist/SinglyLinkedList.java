package Linkedlist;
import java.util.*;
public class SinglyLinkedList {
//    public static void display(Node head){
//        Node temp=head;
//        int count=0;
//        while(temp!=null){
//            count++;
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
//        System.out.println(count);
//    }
    public static void displayr(Node head,int count){
        // recursively print linkedlist
        if(head==null){
            return;
        }

        System.out.println(count++);
        displayr(head.next,count);
    }
public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }

}

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node head=a;
        int count=1;
        displayr(head,count);



    }
}
