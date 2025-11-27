package Linkedlist;

public class practiceSll {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }}
public static class llist{
            Node head=null;
            Node tail=null;
             void insertatend(int data){
                Node n =new Node(data);
             if(head==null){
                 head=n;

             }
             else{
                 tail.next=n;


             }
                 tail=n;
            }
            void display(){
                 Node temp=head;
                 while (temp!=null){
                     System.out.println(temp.data);
                     temp=temp.next;
                 }
            }
            void insertatbeg(int data){
                 Node n=new Node(data);
                 if(head==null){
                     insertatend(data);
                 }
                 else{
                     n.next=head;
                     head=n;
                 }
            }
            void insertatpos(int data,int pos){
                 Node n=new Node (data);
if(pos<0 || pos>count()){
    System.out.println("na hoga");
} else if (head==null) {
    insertatend(data);
}
else {
    int i=1;
    Node temp=head;
    while(i<pos-1){
        temp=temp.next;
        i++;
    }
    n.next=temp.next;
    temp.next=n;
}
            }
            int count(){
                 int count=0;
                 Node temp=head;
                 while(temp!=null){
                     count++;
                     temp=temp.next;
                 }
                 return count;
            }
            void deleteatbeg(){
                 if(head==null){
                     System.out.println("tujhe delete krdu?");
                 }
                 else{
                     head=head.next;
                 }
            }
            void deleteatend(){
        if (head == null) {
            System.out.println("tujhe delete krdu?");
        }
        else if (head.next == null) { // sirf 1 node hai
            head = null;
            tail = null;
        }
        else {
            Node temp = head;
            // temp ko second-last node tak le jao
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    void deleteatpos(int pos){
        int nSize = count();

        if (pos <= 0 || pos > nSize) {
            System.out.println("bhaiii");
            return;
        }

        // delete first
        if (pos == 1) {
            head = head.next;
            if (head == null) tail = null;
            return;
        }

       Node temp = head;
        int i = 1;
        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;

        // if we deleted last node
        if (temp.next == null) {
            tail = temp;
        }
    }



    }


        public static void main(String[] args) {
            llist l =new llist();
            l.insertatend(5);
            l.insertatend(15);
            l.insertatend(52);
            l.insertatend(3);
            l.display();
            System.out.println(".................");
            l.insertatbeg(2);
            l.display();
            System.out.println(".................");
            int res=l.count();
            System.out.println("count "+res);
            System.out.println(".................");
            l.insertatpos(22,2);
            l.insertatpos(24,-1);
            l.insertatpos(25,22);
            l.display();
            System.out.println(".................");
            l.deleteatend();
            l.display();
            System.out.println(".................");
            l.deleteatbeg();
            l.display();
            System.out.println(".................");
            l.deleteatpos(3);
        }
    }

