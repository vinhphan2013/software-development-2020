package com.example.helloworld;

import java.util.*;

public class HelloWorld {
    public static void main(String args[]){
        String A="java";
        /* Enter your code here. Print output to STDOUT. */

        String result ="";
        int backward = A.length() - 1;
        for(int i = 0; i < A.length(); i++){
            if(backward >= 0){
                if(A.charAt(i) == A.charAt(backward)){
                    backward--;
                    result = "Yes";

                }else{
                    result = "No";
                }
            }

        }
        System.out.printf("%s", result);
    }

    public static void getSmallestAndLargest(String s, int k)
    {
        // Initialize min and max as first substring of size k
        String currStr = s.substring(0, k);
        String lexMin = currStr;
        String lexMax = currStr;
        //a positive number if the first string is larger,
        // and a negative number if the first string is smaller
        // Consider all remaining substrings. We consider
        // every substring ending with index i.
        for (int i = k; i < s.length(); i++) {
            currStr = currStr.substring(1, k) + s.charAt(i);
            if (lexMax.compareTo(currStr) < 0)
                lexMax = currStr;
            if (lexMin.compareTo(currStr) > 0)
                lexMin = currStr;
        }

        // Print result.
        System.out.println(lexMin);
        System.out.println(lexMax);
    }

    public static int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0)   return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            System.out.println("This is the map"+ map );
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                //count how many elements in the array that appear more than twice.
                System.out.println("value = " + entry.getValue());
                if (entry.getValue() >= 2) {
                    count++;
                    System.out.println("this is the count = " + count);
                }
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        return count;
    }

    /*
    Kth most frequent Character in a given String
    Given a string str and an integer K, the task is to find the K-th most frequent character in the string.
    If there are multiple characters that can account as K-th most frequent character then, print any one of them.
     */
    public static char KmostFrequent(String str){

//        if(arrStr == null || arrStr.length == 0 || k <= 0) {
//            return 0;
//        }
//        Map<String,Integer> map = new HashMap<>();
        //int count = 0;
        //geeksforgeeks

        int[] count = new int[256];
        for (int i=0; i < str.length(); i++){
            System.out.println("This is the char: " +  str.charAt(i));
            System.out.println("count before = " + count[str.charAt(i)]);
            (count[str.charAt(i)])++;//count[g]
            System.out.println("count after = " + count[str.charAt(i)]);
        }
        int first = 0, second = 0;
        for (int i = 0; i < 256; i++)
        {
            /* If current element is smaller than
            first then update both first and second */
            if (count[i] > count[first])
            {
                second = first;
                first = i;
            }
            /* If count[i] is in between first and
            second then update second  */
            else if (count[i] > count[second] &&
                    count[i] != count[first])
                second = i;
        }
        return (char)second;
    }


    public static void ocrrChars(String str){
        int len = str.length();
        int count[] = new int[256]; //This is the counter array to store unsigned char
        for(int i = 0; i <len; i++){
            count[str.charAt(i)]++; //Increase the counter of each individual characters as it appear
            System.out.println(count[str.charAt(i)]);
        }

        //The block of code above will get the count of each character for us
        //Now the one below here will make sure the output will only contains distinct characters without repetition
        //Create another array same length with the original
        char ch[] = new char[len];
        for(int i = 0; i<len;i++) {
            ch[i] = str.charAt(i); //Populate the ch array with str array
            int find = 0; //This is to keep track of of how many repetition we find
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == ch[j]) {
                    find++;
                }
            }
            if (find == 1) {
                System.out.println("The occurence of char " + str.charAt(i) + ":" + count[str.charAt(i)]);
            }
        }
    }

    public static void getOccuringChar(String str)
    {
        // Create an array of size 256 i.e. ASCII_SIZE
        int count[] = new int[256];

        int len = str.length();


        //System.out.println("Character array: " + Arrays.toString(chars));
        // Initialize count array index
        for (int i = 0; i < len; i++){
            count[str.charAt(i)]++;
        }

        // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                // If any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }
            if (find == 1)
                System.out.println("Number of Occurrence of " +
                        str.charAt(i) + " is:" + count[str.charAt(i)]);
        }
    }
}


