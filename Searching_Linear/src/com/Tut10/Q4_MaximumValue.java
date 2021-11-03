package com.Tut10;

import java.util.Arrays;

public class Q4_MaximumValue {

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6,7},                                 //To use maxvalue Integer.MIN_VALUE
                {12,4,5,6,354}
        };

        System.out.println(minimum(arr));
    }

    public static int minimum(int[][] arr) {
        int max = Integer.MIN_VALUE;   //Minimum value integer can take.
        for (int[] ints : arr) {    //Here we searched every array in arr2D array.

            for (int anInt : ints) {  //Here we searched every element in ints array.

                if (anInt > max) {

                    max = anInt;

                }
            }

        }
        return max;
    }


}
