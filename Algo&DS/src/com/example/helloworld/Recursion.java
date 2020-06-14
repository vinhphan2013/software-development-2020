package com.example.helloworld;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Recursion {


    public static void main(String args[]){
        //System.out.println(starString(2));
        writeNums(2);
    }

    public static String starString(int n){
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        else if( n == 0){
            return "*";
        }else{
            return starString(n-1) +  starString(n-1);
        }
    }

    public static void writeNums(int n){
        if(n < 1){
            throw new IllegalArgumentException();
        }else if(n == 1){
            System.out.print("1");
        }else{
            writeNums(n-1);
            System.out.print(", " + n); ;
        }
    }
}
