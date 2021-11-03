package com.Tut13;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5,4 };
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int[] arr){            // Adding a boolean improves the time complexity of the
         boolean swapped = false;                // algorithm. Now the loop will stop when ever for the whole inner
        // Run this outer loop n-1 times          // loop swapped variable is false. That is there is no element in the
        for ( int i = 0;i < arr.length ;i++ ){    // array that is swapped at that pass value of i.

            //Run this loop arr.length - 1 - i times
            for (int j = 1; j <= arr.length - 1 - i;j++ ){
                //Swap if the previous element is greater than the next element
                if (arr[j] < arr[j-1]){
                   Swap(arr, j ,j-1);
                    swapped = true;
                }
                             // When for a whole loop at a particular value of i there is no swaping of elelements
               }if (!swapped){
                break;
            }
        }
    }

    static void Swap(int[] arr,int first,int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }



}
