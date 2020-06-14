package com.example.helloworld;

public class TestList {
    private Recursion[] parent = new Recursion[3];
    private int counter = 0;

    public void add(Recursion i){
        if(counter < parent.length){
            parent[counter] = i;
            System.out.println("List added at index: " + counter);
            counter++;
        }
    }
}
