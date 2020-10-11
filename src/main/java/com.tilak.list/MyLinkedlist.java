package com.tilak.list;
import java.util.*;

public class MyLinkedlist {

    public static void printLinkedlist (Node head){

        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }




    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();

        list1.add(5);
        list1.add(2,12);
        list1.add(9);

//
//        Node t1 = new Node(10);
//
//        t1.next = new Node(20);
//
//        t1.next.next = new Node(30);
//
//        t1.next.next.next = new Node(40);
//
//        t1.next.next.next.next = new Node(50);
//
//
//        t1.next.next.next.next.next = new Node(60);
//
//
//        MyLinkedlist.printLinkedlist(t1);
//
//        MyLinkedlist.printList(t1.next.next);
//
//
//        // 10 | null
//
//        // 10 | 20 address -> 20| null
//
//
//        Node head;
//
//
//        Node first;
//        Node second;
//        Node third;
//        Node fourth;
//
//        head = new Node(-1);
//
//        first = new Node(10);
//        head.insertAfter(first);
//
//
//        second = new Node(20);
//        first.insertAfter(second);
//
//        third = new Node(30);
//        second.insertAfter(third);
//
//        fourth = new Node(40);
//        third.insertAfter(fourth);
//
//        printList(head);
//
//        int a = 5;
//        int b = 6;
//
//        int temp ;
//
//        temp = a;
//        a = b;
//        b = temp;
//
//
//
//    }
//
//    public static void printList(Node head){
//        System.out.println();
//        Node temp= head;
//        while (temp != null){
//            System.out.print(temp.data + " -> ");
//            temp= temp.next;
//        }
    }
}
