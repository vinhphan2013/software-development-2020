package com.data.structure.practice;

public class LinkedListRunner {
    public static void main(String args[]){
        LinkedList list = new LinkedList();

        list.insert(5);
        list.insert(4);
        list.insert(10);
        list.insertAtStart(1);
        list.insertAt(1, 34);
        list.insertAt(0, 55);
        //list.deleteAt(3);

        list.reverse();
        list.show();

    }
}
