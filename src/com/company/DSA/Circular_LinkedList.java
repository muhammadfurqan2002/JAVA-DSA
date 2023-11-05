package com.company.DSA;

public class Circular_LinkedList {
    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);
        display();
    }

    static Node head,tail;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void add(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
        newNode.next=head;
    }
    public static void display(){
        Node cur=head;
        do {
            System.out.print(cur.data+"->");
            cur=cur.next;

        } while (cur!=head);

        System.out.println("null");

    }

}

