package com.example.helloworld;

import java.util.*;
public class TestList {
    public static void main(String args[]){

        String[] list = {"cat", "dog","car","bike"};
        LinkedList<String> linkedlst = new LinkedList<>(Arrays.asList(list));

        linkedlst.add("motor");
        linkedlst.addFirst("things");

        list = linkedlst.toArray(new String[linkedlst.size()]);

        for(String i: list){
            System.out.printf("%s ", i);
        }
        System.out.println();
        Stack<String> stck = new Stack<>();
        stck.push("cat");
        printStck(stck);
        stck.push("dog");
        printStck(stck);
        stck.push("fish");
        printStck(stck);

        stck.pop();
        printStck(stck);
        stck.pop();
        printStck(stck);
        stck.pop();
        printStck(stck);

    }

    private static void printStck(Stack<String> stck) {
        if(stck.isEmpty()){
            System.out.println("Nothing left");
        }else{
            System.out.printf("%s TOP\n", stck);
        }
    }
}
