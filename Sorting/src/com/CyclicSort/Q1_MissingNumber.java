package com.CyclicSort;

import java.util.Arrays;

public class Q1_MissingNumber {
/*
      Given an array arr containing n distinct numbers in the range [0, n], return the only number in the range that
      is missing from the array.

      Ex arr = {4,3,1,0}
      here ans = 2 since from 0 to 4 only 2 is missing in this array.

      Ex arr = {3,2,0,1}
      here ans = 4 since the range of array is from 0 to N and N is missing.


 Solution : We will do this question in two steps
          1 : First sorting the array using cyclic method since the range of elements if from 0 to N
          2 : Secondly we will check for the missing element in the array.
 */
/*
    Logic for 1 : Simple cyclic sort will be coded but since there is one element which is missing and there is chance that
                  element present in the array could be equal to arr.length.For that case we will ignore that element and
                  move forward in the loop.

    Logic for 2 : For checking we simply iterate a loop from i = 0; to i < arr.length ; if the element at that index i
                  will not be equal to the index, then return index. And if every element is present in  the correct
                  index then we will return arr.length Bcz we can only fit N - 1 elements in the array. And if no element
                  is missing then only the element equal to the length of the array is missing.
                  Hence, we return arr.length;

 */


    public static void main(String[] args) {

        int[] arr = {4,2,1,0};
        Sort(arr);
        int missingNumber = Missing(arr);
        System.out.println(missingNumber);

    }

    public static int Missing(int[] arr) {

        for (int i = 0; i < arr.length; i++){

            if ( arr[i] != i ){

                return i;

            }

        }// For loop over.

        return arr.length;

    }

    public static void Sort(int[] arr) {
                // Cyclic sort
        int i = 0;

        while ( i < arr.length ){

            int correctIndex = arr[i];

            if ( arr[i] < arr.length && arr[i] != arr[correctIndex]){ // Here we did arr[i] < arr.length with &&
                                          // arr[i] != arr[correctIndex] because we will only swap for elements that are
                swap(arr,i,correctIndex); // less than arr.length and ignore for element which is equal to arr.length.
                                          // and swap for elements that are less than arr.length.
            }else{ i++;}

        } //while loop over.

    }

    public static void swap(int[] arr, int first, int second ){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }


}
