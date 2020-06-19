package com.data.structure.practice;

public class Queue {
    int size = 0;
    int front = 0;
    int rear = 0;
    int queue[] = new int[5];

    //Insert
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
        }else {
            queue[rear] = data;
            rear = (rear + 1)% 5;
            size++;

        }
    }

    //Remove
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            int data = queue[front];
            front = (front+1)%5;
            size--;
        }
    }
    public void show(){
        System.out.print("these are the element: ");
        for(int i = 0; i < size; i++){
            System.out.print(queue[(front+i)%5] + " ");
        }
        System.out.println();
        System.out.print("This is the whole array ");
        for(int i : queue){
            System.out.print(i + " ");
        }
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == 5;
    }
}
