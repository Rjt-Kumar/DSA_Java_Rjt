package com.QuestionBinarysearch;

public class Q2_FloorOfANumber {

    // Floor of a number is equal to the greatest number smaller than or equal to the target number present in the array.
    // The code is mostly same with that of Ceiling of the number but there is a difference between them
    // In ceiling if the target element is not present in the array we return an element greater than
    // The target element which is ( start in case of ascending order and end in the case of descending order )
    // Here we have to do opposite of the ceiling ( we will return end in the case of ascending order and start in the case of descending order )
    // Because  For Ascending order :
    /*
      when the while loop condition will violate (start > end) then the value of arr[start] > arr[end] and since
      floor means greatest number smaller than equal to target we return the smaller one that is arr[end]..

      For Descending order :

      when while loop condition violate the value of arr[start] < arr[end] kyuki jab while loop cancel hota hai
      tab start ki value greater hote hai end se.And in descending order arr[start] < arr[end]. That is why for floor
      of a number in case of descending order we return arr[start] .

     */

    public static void main(String[] args) {

        int[] arr = {2,4,6,8,10,23,45,67,68,86,345,678};
        int target = 1;
        int ans = FloorOfANumber(arr,target);
        System.out.println(ans);

    }

     static int FloorOfANumber(int[] arr, int target) {
         int start = 0;
         int end = arr.length - 1;
         boolean isAsc = arr[start] < arr[end];

         if (isAsc) {                         // These are the edge cases for the floor of the number
             if (target < arr[start]) {       // If there is no element present in the array that is smaller than
                 return -1;                   // or equal to the target element then we return -1.
             }                                // example {23,34,45,56,78,89,90}
         } else {                             //  floor of 5
             if ( target < arr[arr.length-1]){ // now since there is no number present in the array that is smmaler than or equal to the target that is 5
                                              // Hence we return -1
                 return -1;
             }

         }
                 while (start <= end) {

                     int middle = start + (end - start) / 2;

                     if (arr[middle] == target) {

                         return middle;

                     }
                     if (isAsc) {           //In case of ascending order

                         if (arr[middle] > target) {

                             end = middle - 1;

                         } else {

                             start = middle + 1;

                         }

                     } else  {              //In case of descending order

                         if (arr[middle] > target) {

                             start = middle + 1;

                         } else {

                             end = middle - 1;

                         }

                     }

                 }


         if (isAsc){

             return arr[end];

         } else{

             return arr[start];

         }
     }




}