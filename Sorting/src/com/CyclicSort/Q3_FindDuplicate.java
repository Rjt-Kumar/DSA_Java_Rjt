package com.CyclicSort;


import static com.CyclicSort.Q1_MissingNumber.swap;

public class Q3_FindDuplicate {

    public static void main(String[] args) {
         int[] arr =  {1,1,2};
          cyclicSort(arr);

         int answer = arr[arr.length - 1];
        System.out.println(answer);
    }

    public static void cyclicSort(int[] arr) {

         int i = 0;

         while (i < arr.length){

             int correctIndex = arr[i] - 1;

             if (arr[i] != arr[correctIndex]){

                 swap(arr,i,correctIndex);

             }else { i++; }

         }// while loop over

    }


}
