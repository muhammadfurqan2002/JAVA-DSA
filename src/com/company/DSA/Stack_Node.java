package com.company.DSA;

public class Stack_Node {


    public static void main(String[] args) {

        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);
        pop();
        display();
    }












    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.next=null;
            this.data=data;
        }
    }

    public static void push(int data){
        if (head==null){
            head=new Node(data);
            return;
        }
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public static int pop(){
        if (head==null){
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }
    public static int peek(){
        if (head==null){
            return -1;
        }
        return head.data;
    }

    public static void display(){
        Node cur=head;
        while (cur!=null){
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
        System.out.println("null");
    }
}
