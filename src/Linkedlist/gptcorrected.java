package Linkedlist;

public class gptcorrected {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class Linkedlist {
        Node head = null;
        Node tail = null;

        void insertatend(int data){
            Node n = new Node(data);
            if (head == null) {
                head = n;
                tail = n;
            } else {
                tail.next = n;
                tail = n;
            }
        }

        void display(){
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        void insertatbeg(int data){
            Node n = new Node(data);
            if (head == null) {
                head = n;
                tail = n;
            } else {
                n.next = head;
                head = n;
            }
        }

        void insertatpos(int data, int pos){
            int na = size();
            // valid positions: 1 .. na+1
            if (pos <= 0 || pos > na + 1) {
                System.out.println("ni hoga bhai!");
                return;
            }

            // insert at beginning
            if (pos == 1) {
                insertatbeg(data);
                return;
            }

            // insert at end
            if (pos == na + 1) {
                insertatend(data);
                return;
            }

            // insert in middle
            Node n = new Node(data);
            int i = 1;
            Node temp = head;
            while (i < pos - 1) {
                temp = temp.next;
                i++;
            }
            n.next = temp.next;
            temp.next = n;
        }

        int size(){
            Node temp = head;
            int count = 0;
            while (temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }

        void deleteatbeg(){
            if (head == null) {
                System.out.println("kya re bat ka grip...");
            } else {
                head = head.next;
                if (head == null) {
                    tail = null; // list empty
                }
            }
        }

        void deleteatend(){
            if (head == null) { // list empty
                System.out.println("tu phir ... bat lao be!");
                return;
            }

            if (head.next == null) { // only one node
                head = null;
                tail = null;
                return;
            }

            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            // temp is 2nd last
            temp.next = null;
            tail = temp;
        }

        void deleteatpos(int pos){
            int nSize = size();

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
        Linkedlist ll = new Linkedlist();
        ll.insertatend(5);
        ll.display();
        System.out.println("-----------------------");
        ll.insertatbeg(10);
        ll.insertatend(15);
        ll.insertatend(20);
        ll.insertatend(25);
        ll.display();
        int res = ll.size();
        System.out.println("-----------" + res);
        System.out.println("-----------------------");
        ll.insertatpos(30, 4);
        ll.insertatpos(35, -1);
        ll.insertatpos(40, 10);
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
    }
}

