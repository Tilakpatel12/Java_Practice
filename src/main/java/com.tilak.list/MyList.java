package com.tilak.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyList {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);

        for (int i=0; i<10; i++){
            arrayList.add(i);
        }
        arrayList.add(0);
        System.out.println(arrayList.indexOf(5));

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);

        arrayList.addAll(list2);

        //arrayList.clear();

        System.out.println(arrayList.get(5));
        System.out.println(arrayList);

        System.out.println(arrayList.isEmpty());

        arrayList.add(0);
        System.out.println(arrayList.lastIndexOf(0));


        if (arrayList.contains(10)){
            System.out.println("true");
        }

        arrayList.remove(0);
        System.out.println(arrayList);

        System.out.println("Size ="+arrayList.size());

        ArrayList list = new ArrayList();
        //list.add();


        ArrayList<String> arrList= new ArrayList<>();
        arrList.add("Tilak");
        arrList.add("Mitt");

        System.out.println(arrList);
        arrayList.remove(0);
        //System.out.println("Removed element = "+removedElemtn);

        System.out.println(arrList);

        boolean flag = arrayList.contains("Tilak");
        System.out.println("IT containe tilak = "+flag);


        //print , itereate

        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext())
        {
            System.out.print(iterator.next());

        }
        for (String str1: arrList){
            System.out.println(str1);
        }

        System.out.println();
        Iterator arrListIterator = arrList.iterator();

        while(arrListIterator.hasNext()){
            System.out.print(arrListIterator.next() + " " );
        }

        System.out.println();
        ArrayList<Character> charArray = new ArrayList<Character>();

        charArray.add('A');
        charArray.add('T');
        charArray.add('m');

        Iterator charArrayIterator = charArray.iterator();
        while (charArrayIterator.hasNext()){
            System.out.print(charArrayIterator.next());
        }
        System.out.println();
        for (Character c : charArray){
            System.out.print(c);
        }


        int [] array= {1,2,3};



    }

}
