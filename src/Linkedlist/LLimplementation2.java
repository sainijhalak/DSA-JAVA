package Linkedlist;

public class LLimplementation2 {
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
    Node temp=new Node(data);
    if(head==null){
        head=temp;


    }
    else{
        tail.next=temp;

    }
    tail=temp;

}
void insertAtBeginning(int data){
    Node n =new Node(data);
    if(head==null){
        insertAtEnd(data);

    }
    else{
        Node temp=head;
        head=n;
        n.next=temp;

    }

}
void display(){
    Node temp=head;
while(temp!=null){
    System.out.println(temp.data+"");
    temp=temp.next;
}
}



    }
    public static void main(String[] args) {
        linkedlist ll =new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display();
        ll.insertAtBeginning(12);
        ll.display();

    }
}
