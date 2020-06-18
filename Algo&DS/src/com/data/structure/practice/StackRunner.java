package com.data.structure.practice;

public class StackRunner {
    public static void main(String args[]){
        Stack stack = new Stack();

        stack.push(5);
        stack.push(18);
        stack.push(20);
        stack.push(100);
        stack.push(30);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Size: " + stack.size());
        System.out.println("isEmpty: " + stack.isEmpty());



        stack.show();
    }
}
