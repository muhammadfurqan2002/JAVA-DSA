package com.company.DSA;

public class My_Queue {
    static Node head,tail;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void Enqueue(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
        newNode.next=null;
    }
    public static int  Dequeue(){
        if (head==null){
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }
    public static void display(){
        Node cur=head;
        while (cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
}
