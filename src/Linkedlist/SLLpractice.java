package Linkedlist;

public class SLLpractice {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int data){
            Node n=new Node(data);
            if(head==null){
                head=tail=n;
            }
            else{
                tail.next=n;
                tail=n;

            }
            tail=n;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        void size() {
            Node c=head;
            int count=0;
            while(c!=null){
                count++;
                c=c.next;
            }
            System.out.println(count);
        }
        void insertAtBeg(int data){
            Node n=new Node(data);
            if(head==null){
                insertAtEnd(data);
            }
            else{
                Node temp=head;
                head=n;
                n.next=temp;
            }
        }
        void insertAtPos(int data,int pos){
            if(head==null){
                insertAtEnd(data);
            }
            else{
                Node n=new Node( data);
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


    }

    public static void main(String[] args) {
        linkedlist l=new linkedlist();
        l.insertAtEnd(50);
        l.insertAtEnd(15);
        l.insertAtEnd(25);
        l.insertAtEnd(35);
        l.insertAtEnd(45);
        System.out.println();
        l.display();
        System.out.println();
        l.size();
        System.out.println();
        l.insertAtBeg(12);
        l.display();
        System.out.println();
        l.insertAtPos(20,2);
        l.display();
    }
}
