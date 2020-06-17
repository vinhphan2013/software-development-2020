package com.example.helloworld;

import java.util.ArrayList;

public class TestFive {

    public static void main(String args[]) {

        int array[][] = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};
        int sr = 0;
        int er = array.length - 1;
        int sc = 0;
        int ec = array[0].length - 1;

/*
			->    start col      end col
                     |			 |
                     V		     V
Start row -->	0	[ 1,  2,  3, 4]
            +	1	[12, 13, 14, 5]
                2   [11, 16, 15, 6]
end row		-	3   [10,  9,  8, 7]
                     0    1   2  3
row.length = 4;
col.length = 4;
array[row][col]

*/

        var result = new ArrayList<Integer>();
        while (sr <= er && sc <= ec) {
            //First row from left to right
            for (int column = sc; column < ec + 1; column++) {
                result.add(array[sr][column]);
                System.out.println(result);
            }
            //Last column from top to bottom
            for (int row = sr+1; row < er + 1; row++){
                result.add(array[row][ec]);
                System.out.println(result);
            }
            //Last row from right to left
            for(int col = ec-1; col >= sc; col--){
                result.add(array[er][col]);
                System.out.println(result);
            }

            //First column from bottom to top
            for (int ro = er-1; ro >= sr + 1; ro--){
                result.add(array[ro][sc]);
                System.out.println(result);
            }
            sc++;
            ec--;
            sr++;
            er--;

        }
    }

}

/*
                1,  2,  3, 4
               10, 11, 12, 5
                9, 8,   7, 6


 */




//        int multi1[][] = {{0, 1, 43, 24, 54}, {4545, 231, 65, 343}};
//        int multi12[][] = {{34, 454, 34}, {12344}, {434, 54, 232, 45}};
//        System.out.println("This is first array:");
//        displayMultiArray(multi1);
//        System.out.println("This is second array:");
//        displayMultiArray(multi12);

//        int sr = array[0][0];
//        int er = array[array.length - 1][0];
//        int sc = array[0][0];
//        int ec = array[0][array.length - 1];
//        public static void displayMultiArray(int multi[][]){
//
//            for(int row = 0; row < multi.length; row++){
//                for(int col = 0; col < multi[row].length; col++){
//                    System.out.print(multi[0][0] + "\t");
//                }
//                System.out.println();
//            }
//
//        }