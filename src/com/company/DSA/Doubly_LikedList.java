package com.company.DSA;

public class Doubly_LikedList {
    public static void main(String[] args) {
        addFirst(1);
        addFirst(2);
        addFirst(3);
        addFirst(4);
        addFirst(5);
        addLast(10);
//        deleteFirst();
        deleteLast();
        display();
    }
    static Node head;
    static class Node {
        int data;
        Node next,prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static void addFirst(int data){
        Node newNode=new Node(data);
        newNode.prev=null;
        newNode.next=head;
        if (head!=null){
            head.prev=newNode;
        }
        head=newNode;
    }


    public static void addLast(int data){
        Node cur=head;
        while (cur.next!=null){
            cur=cur.next;
        }
        Node newNode=new Node(data);
        cur.next=newNode;
        newNode.prev=cur;
        newNode.next=null;
        if (head==null){
            head=newNode;
            newNode.prev=null;
        }
    }


    public static int deleteFirst(){
        if (head==null){
            return -1;
        }
        int top=head.data;
        head=head.next;
        head.prev=null;
        return top;
    }

    public static int deleteLast(){
        if (head==null){
            return -1;
        }
        Node cur=head,prev=null;

        while (cur.next!=null){
            prev=cur;
            cur=cur.next;
        }
        int last=cur.data;
        prev.next=null;
        return last;
    }

    public static void display(){
        Node cur=head;
        Node prev=null;
        while (cur!=null){
            prev=cur;
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
        System.out.println("null");
        while (prev!=null){
            System.out.print(prev.data+"->");
            prev=prev.prev;
        }
        System.out.println("null");

    }
}
