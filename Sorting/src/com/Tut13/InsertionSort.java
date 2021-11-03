package com.Tut13;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static public void InsertionSort(int[] arr){

        for (int i = 0; i <= arr.length - 2; i++){

            for (int j = i + 1; j > 0; j--){

                if( arr[j] < arr[j - 1] ){ // hum yaha pe j ko i+1 assign karke usse left ke elements se compare kar
                                           // rahe hai. If the previous element is lesser than the next element than
                    swap( arr , j ,j-1 );  // swap, else break. Break because we don't need to check further
                                           // as all the elements in the left are already sorted.
                } else {

                    break;

                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second]= arr[first];  // Here we didn't swap temp = max and like that because these are indexes not the elements
        arr[first] = temp;     // and we have to swap the elements at those indexes not the indexes.

    }

}
