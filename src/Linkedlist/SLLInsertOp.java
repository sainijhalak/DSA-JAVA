package Linkedlist;

public class SLLInsertOp {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
    public static class Linkedlist{
        Node head=null;
        Node tail=null;
        void insertatend(int data){

        Node n= new Node(data);
        if(head==null)
        {
            head=n;

        }
        else{
            tail.next=n;

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
        void insertatbeg(int data){
            Node n=new Node(data);
            if(head==null){
                insertatbeg(data);
            }
            else{
                Node temp=head;
                head=n;
                n.next=temp;
            }
        }
void insertatpos(int data,int pos){
           Node n=new Node(data);
            int na=size();
            if(pos<0 || pos>na){
                System.out.println("ni hoga bhai!");
            }
            else{
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
int size(){
            Node temp =head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;

}


    }



    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.insertatend(5);
        ll.display();
        System.out.println("-----------------------");
        ll.insertatbeg(10);
        ll.insertatend(15);
        ll.insertatend(20);
        ll.insertatend(25);
        ll.display();
        int res=ll.size();
        System.out.println("-----------"+res);
        System.out.println("-----------------------");
        ll.insertatpos(30,4);
        ll.insertatpos(35,-1);
        ll.insertatpos(40,10);
        ll.display();
    }
}
