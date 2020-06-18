package com.data.structure.practice;

public class Stack {

    int stack[] = new int[5];
    int top = 0;

    public void push(int data){
        if(top == stack.length){
            System.out.println("Stack is full");
        }else{
            stack[top] = data;
            top++;
        }
    }

    public void pop(){
        if(top <= 0){
            System.out.println("There is no more to pop");
        }else{
            top--;
            stack[top] = 0;
        }
    }

    public int peak(){
        int data;
        data = stack[top-1];
        return data;
    }

    public void show(){
        for(int i : stack){
            System.out.print(i + " ");
        }
    }

    public boolean isEmpty(){
        return top <= 0;
    }

    public int size(){
        return top;
    }
}
