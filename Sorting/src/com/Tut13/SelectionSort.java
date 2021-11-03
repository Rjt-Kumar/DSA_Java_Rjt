package com.Tut13;

import java.util.Arrays;

public class SelectionSort {
/*
     In selection sort, while running first loop we find the maximum element in that array and swap it with the element
     at the right index,
     First find the index of the maximum element in the array and then swap it with the element at the last place,
     That was for the first pass.
     For second loop we have to find the maximum element in the array except the last element.
     Hence, we replace it with element at the second last index. [[[ last = arr.length - i - 1 ]]]

 */


     public static void main(String[] args) {

         int[] arr = {3, 5, 2, 1, 4};
         SelectionSort(arr);
         System.out.println(Arrays.toString(arr));

     }

     static void SelectionSort(int[] arr){

         for (int i = 0; i < arr.length; i++){
             // Find the maximum element and replace it with last index
          int last = arr.length - i - 1;        // It is the last place of the unsorted array at every loop
          int max = getMax(arr,0,last);    // we have to swap maximum number with the element at last index.
          swap(arr,last,max);


         }

     }

     static void swap(int[] arr, int last, int max) {
         int temp = arr[max];
         arr[max]= arr[last];  // Here we didn't swap temp = max and like that because these are indexes not the elements
         arr[last] = temp;     // and we have to swap the elements at those indexes not the indexes.

    }

    static int getMax(int[] arr, int start, int end) {

         int max = start;      // Note that here max is not the maximum element it is the index of the
         for (int i = start; i <= end; i++){ // maximum element.

             if (arr[i] > arr[max]){

                 max = i;

             }
         }
         return max;
    }


}
