package com.example.helloworld;
import java.util.*;
public class TestFOur {

       public static void main(String args[]){
           String[] things = {"cat", "dog","pig","fish"};
           List<String> lst1 = new LinkedList();

           for(String x : things){
               lst1.add(x);
           }

           String[] obj = {"chair", "table","hat","car","dog","fish"};
           List<String> lst2 = new ArrayList();

           for(String x : obj){
               lst2.add(x);
           }

           lst1.addAll(lst2);
           lst2 = null;

           printMe(lst1);
           removeStuff(lst1, 2, 5);
           printMe(lst1);
           reverseMe(lst1);


       }

    private static void removeStuff(List<String> lst1, int i, int i1) {
           lst1.subList(i,i1).clear();

    }

    private static void printMe(List<String> lst1) {
           for(String i: lst1){
               System.out.printf("%s ", i);

           }
        System.out.println();
    }

    private static void reverseMe(List<String> lst1) {
           ListIterator<String> itr = lst1.listIterator(lst1.size());
           while(itr.hasPrevious()){
               System.out.printf("%s ", itr.previous());
           }
    }


}
