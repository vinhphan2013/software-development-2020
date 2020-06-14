package com.example.helloworld;

public class TestFOur {

       public static void main(String args[]){
           TestFive five = new TestFive();
           Recursion twp = new RecursionTwo();
           Recursion three = new RecursionThree();

           five.digest(twp);
           five.digest(three);
       }


}
