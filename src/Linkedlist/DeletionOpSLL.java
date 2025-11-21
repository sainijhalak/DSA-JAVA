package Linkedlist;

public class DeletionOpSLL {
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
                insertatend(data);
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
        void deleteatbeg(){
            if(head==null){
                System.out.println("kya re bat ka grip...");
            }
            else{
                head=head.next;
            }

        }
        void deleteatend(){
            if(tail==null){
                System.out.println("tu phir ... bat lao be!");
            }
            else{
                Node temp=head;
                Node prev=temp;
                while(temp.next!=null){
                    prev=temp;
                    temp=temp.next;
                }
                prev.next=null;
            }
        }
        void deleteatpos(int pos){

            if(pos<0 || pos>size()){
                System.out.println("bhaiii");
            } else if (pos==1) {
                 head=null;

            } else{
                Node temp=head;

                int i=1;
                while(i<pos-1){
                    temp=temp.next;

                    i++;
                }
                temp.next=temp.next.next;
            }

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
        System.out.println("--------------------");
        ll.deleteatbeg();
        ll.display();
        System.out.println("--------------------");
        ll.deleteatend();
        ll.display();
        System.out.println("--------------------");
        ll.deleteatpos(2);
        ll.display();
        System.out.println("--------------------");
        int s=ll.size();
        System.out.println("-----------"+s);

    }
}
