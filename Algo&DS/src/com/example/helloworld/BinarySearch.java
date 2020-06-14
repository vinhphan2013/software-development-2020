package com.example.helloworld;

import java.util.Arrays;

/*
ARRAY NEEDS TO BE SORTED FIRST IN ORDER FOR THIS ALGO TO WORK
Binary search break the string into half every time and check for valid result
 */
public class BinarySearch {
    public static void main(String[] args){
        int[] numbers = {1,5,3,6,19,13,53,65,23,65,32};
        int target = 0;
        int result = findNumber(numbers,target);
        System.out.println("Result @ index " + result);
    }




    public static int findNumber(int numbers[], int target) {
        Arrays.sort(numbers);
        int low = 0;
        int high = numbers.length - 1;
        //System.out.println(Arrays.toString(numbers));

        while(low <= high){
            int div = (high + low) / 2;
            if(numbers[div] == target) {
                return div;
            }else if(numbers[div] < target){
                low = div + 1;
            }else if(numbers[div] > target){
                high = div - 1;
            }
        }
        return -1;
    }

}
