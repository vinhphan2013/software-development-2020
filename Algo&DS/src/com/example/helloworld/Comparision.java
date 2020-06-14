package com.example.helloworld;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Arrays;


public class Comparision {
    public static void main(String[] args){
        ArrayList<Player> p1 = new ArrayList<>();
        p1.add(new Player ("Phan", "Vinh", 1234));
        p1.add(new Player ("Le", "Tu", 5678));
        p1.add(new Player ("Nguyen", "Sanh", 3874));

//        System.out.println(p1);
//        Comparator<Player> compare = (Player pla1, Player pla2) -> pla1.ln.compareTo(pla2.ln) ;
//        Collections.sort(p1,compare);
//        System.out.println(p1);

//        System.out.println("Before sorting " + p1);
//        Collections.sort(p1, new Comparator<Player>() {
//            @Override
//            public int compare(Player o1, Player o2){
//                return o1.ln.compareTo(o2.ln);
//            }
//        });
//        System.out.println("After sorting " + p1);
//
//        //Move to using lambda
//        Collections.sort(p1, (o1, o2) -> o1.ln.compareTo(o2.ln));

        String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        System.out.println(Arrays.toString(reorderLogFiles(logs)));
        //Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
        //
//        "dig1 8 1 5 1",
//        "let1 art can",
//        "dig2 3 6",
//        "let2 own kit dig",
//        "let3 art zero"
    }
    public static String[] reorderLogFiles(String[] logs) {
        System.out.println(Arrays.toString(logs));
        Arrays.sort(logs, (s1, s2) -> {
            String[] split1 = s1.split(" ", 2);
            String[] split2 = s2.split(" ", 2);

            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
            System.out.println(Arrays.toString(logs));

            if(!isDigit1 && !isDigit2) {
                // both letter-logs.
                int comp = split1[1].compareTo(split2[1]);
                if (comp == 0) return split1[0].compareTo(split2[0]);
                else return comp;
            } else if (isDigit1 && isDigit2) {
                // both digit-logs. So keep them in original order
                return 0;
            } else if (isDigit1 && !isDigit2) {
                // first is digit, second is letter. bring letter to forward.
                return 1;
            } else {
                //first is letter, second is digit. keep them in this order.
                return -1;
            }

        });
        return logs;
    }
}
