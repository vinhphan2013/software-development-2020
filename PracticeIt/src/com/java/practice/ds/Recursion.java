package com.java.practice.ds;

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
            System.out.print(", " + n);
        }
    }

    public static void writeSequence(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        if (n == 1) {
            System.out.print("1");
        } else if (n == 2) {
            System.out.print("1 1");
        } else {
            int m = (n + 1) / 2;
            System.out.print(m + " ");
            writeSequence(n - 2);
            System.out.print(" " + m);

        }
    }

    public static void writeSquares(int n){
        if (n < 1) {
            throw new IllegalArgumentException();
        }if (n == 1) {
            System.out.print("1");
        }else {
            if((n%2) != 0){
                System.out.print(n * n + ", ");
                writeSquares(n-2);
                System.out.print(", " + (n-1) * (n-1));
            }else{
                System.out.print((n-1) * (n-1));
                if(n!=2){
                    System.out.print(", ");
                    writeSquares(n-2);
                }
                System.out.print(", " + n * n);
            }
        }
    }
    public static void writeChars(int n){
        if (n < 1) {
            throw new IllegalArgumentException();
        }if (n == 1) {
            System.out.print("*");
        }else if (n == 2) {
            System.out.print("**");
        }else {
            System.out.print("<");
            writeChars(n-2);
            System.out.print(">");
        }
    }
}