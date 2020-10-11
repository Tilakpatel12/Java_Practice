package com.tilak.list;

public class LinkedList1 {

    Node head;
    public void insert(int data){

        Node node1 = new Node(10);
        node1.data= data;

        if( head == null){
            head = node1;
        }
        else{
            Node n = head;
            while (n.next != null){
                n = n.next;
            }
            n.next = node1;
        }
    }
    public void print(){
        Node node1 = head;
        while (node1.next != null){
            System.out.println(node1.data);
            node1 = node1.next;
        }
    }
}
