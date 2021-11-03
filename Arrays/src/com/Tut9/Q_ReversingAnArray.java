package com.Tut9;

import java.util.Arrays;

public class Q_ReversingAnArray {

    public static void main(String[] args) {

        int[] arr = {1 , 2, 3, 4, 5,6 }; // It is an example of two pointer method . one pointer is start and other at
                                         // is at end.
       int start = 0;
       int end = arr.length - 1;  // humne 1 minus isleye kiya kyuki arr.length number of elements batate hai na ki last index
                                  // Here arr.length = 6 but the last index will be 5.
       while ( start <= end){

           swap(arr, start,end);
           start++;     //fistly we will swap 1st and last value then we will swap second and second last value
           end--;       //that is why we are incrementing the first pointer and decrementing the second pointer

       }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;


    }

}
