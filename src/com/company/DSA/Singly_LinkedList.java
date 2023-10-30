package com.company.DSA;

public class Singly_LinkedList {

    public static void main(String[] args) {
        addFirst(1);
        addFirst(2);
        addFirst(3);
        addFirst(4);
        addFirst(5);
        addFirst(6);
//        deleteFirst();
//        deleteLast();


        System.out.println(search(-1));
        display();
    }

    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void addFirst(int data){
        if (head==null){
            head=new Node(data);
            return;
        }
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public  static void addLast(int data){
        if (head==null){
            head=new Node(data);
            return;
        }
        Node newNode=new Node(data);
        Node cur=head;
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=newNode;
        newNode.next=null;
    }
    public static int deleteFirst(){
        if (head==null){
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }
    public static int deleteLast(){
        if (head==null){
            return -1;
        }
        Node cur=head;
        Node prev=null;
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
            while (cur!=null){
                System.out.print(cur.data+"->");
                cur=cur.next;
            }
        System.out.println("null");
    }

    public static boolean search(int key){
        if (head==null){
            return false;
        }
        Node cur=head;
        while (cur!=null){
            if (cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

}
