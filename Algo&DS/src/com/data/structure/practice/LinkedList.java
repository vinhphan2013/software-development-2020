package com.data.structure.practice;

public class LinkedList {

    Node head; //This is the reference to the Node class
    public void insert(int data){
        Node node = new Node(); //node instance
        node.data = data; //set the data for the node
        node.next = null;// this is optional as it will automatically set it even if we don't set it here

        //Check if there is an existing node or not
        if(head == null){//no existing node
            head = node;
        }else{
            Node n = head; //if there is an existing node, let n is head
            while(n.next != null){
                //if there is a next node
                n = n.next;
            }
            n.next = node; //traverse until the last node and set it equal to the new node
        }
    }

    //Add a node in the beginning
    public void insertAtStart(int data){
        Node n  = new Node();
        n.data = data;
        n.next = null;
        n.next = head; //point the new node to the head
        head = n; //set head to the new node
    }
    /*    Insert @ 1
            Head                Tail
            [][]--[][]--[][]--[][]
              0     1     2     3
               \ /
      newNode [][]

            node[i-1] = newNode;
            newNode.next = node[i+1]
     */

    //Add a node anywhere
    public void insertAt(int index, int data){

        Node newNode  = new Node();
        newNode.data = data;
        newNode.next = null;
        if(index == 0){
            insertAtStart(data);
        }else{
            Node n = head;
            for(int i = 0; i < index - 1; i++){
                //Every time we traverse, we set n to the next node
                n = n.next;
            }
            newNode.next = n.next;
            n.next = newNode;
        }
    }


    public void deleteAt(int index){

        if(index == 0) {
            head = head.next;
        }else{
            Node n = head;
            Node temp = null;
            for(int i = 0; i < index - 1; i++){
                //Every time we traverse, we set n to the next node
                n = n.next;
            }
            temp = n.next;
            n.next = temp.next;
            temp = null;
        }
    }

    public void reverse(){
       Node currHead = head;
       Node prev = null;
        while(currHead != null){
           Node next = currHead.next; //To save next node
           currHead.next = prev;
           prev = currHead;
           currHead = next;
        }
        System.out.println("This is head " + prev.data);
    }

    public void show(){
        Node n = head;
        while(n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }




}
