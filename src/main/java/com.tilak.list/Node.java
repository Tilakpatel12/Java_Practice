package com.tilak.list;

public class Node {
    int data;
    Node next;

    Node (int data){
        this.data = data;
        next = null;
        System.out.println();
    }


    public void insertAfter (Node dest){
        // this = third   dest = fourth

        Node temp;
        temp = this.next ;
        this.next = dest;
        dest.next = temp;
    }


}
