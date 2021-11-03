package com.Tut9;

import java.util.Arrays;

public class ColumnNofixedSize {

    public static void main(String[] args) {

        int[][] arr = {
                {1,3,4,2},
                {23,5},
                {3,6,85}
        };

        for ( int row = 0; row < arr.length; row++){
          //  for ( int col = 0; col < arr[row].length; col++){  // For printing array 2D array we dont need to add nested for loop
            // we have to use only one loop
                System.out.println(Arrays.toString(arr[row]));
          //  }
        }


    }

}
