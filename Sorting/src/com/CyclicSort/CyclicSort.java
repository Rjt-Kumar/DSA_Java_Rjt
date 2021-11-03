package com.CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    /*                Index from 1 to N.
      We have to use cyclic sort when all the elements that are given in the array are in a particular range, and are
      also continous. Ex {5,3,2,1,4} all the elements in this array are form  1 to N

      It is best to use for this type of cases as it's time complexity in worst case is O(2N-1) i.e. O(N) = Linear Time
      complexity.

      Here we have to use a while loop which will run till N - 1
      and for every index we have to check if the element at that index is at the right index if not then swap it with
      the correct index which is in this case correctIndex = arr[i] - 1;
      then swap.
      else i++;

      If there is an increment in the value of i, it means that the element at i is at it's right place.

     */

    public static void main(String[] args) {

        int[] arr = {5,3,4,2,1};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void CyclicSort(int[] arr){

        int i = 0;

        while( i < arr.length) {

            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {

                swap(arr, i, correct);

            } else {
                i++;
            }

        }

        }

    private static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}










