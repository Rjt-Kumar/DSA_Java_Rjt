package com.Tut10;

import java.util.Arrays;

public class Q3_SearchingIn2D {

    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {4,5,6,7},                                 //To use maxvalue Integer.MIN_VALUE
               {12,4,5,6,354}
        };

        int target = 354345;
        int[] ans =search(arr,target);
        System.out.println(Arrays.toString(ans));

    }

    public static int[]  search(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++){

            for(int col = 0; col < arr[row].length ; col++){

                if( arr[row][col] == target){

                    return new int[]{row,col}; //We have written new here because we have to initialise it.
                    //Because it is a new array
                }

            }
                       // While returning a value in arrays we have to use the new keyword.
        }
        return new int[]{-1,-1};

    }


}
