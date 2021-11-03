package com.QuestionBinarysearch;

public class Q1_CeilingOfANumberByMe {

    // If we are given a sorted array then we should try Binary search
    // when we are working with the sequence of number which are sorted then we apply Binary search

    // Ceiling of a number means the smallest number present in the array that is greater than or equal to
    // the target number
    /* For example arr = {2,3,4,6,8,11,14,15,17,19};

    Then the ceiling of the number 7 :

       Step 1 : what are all numbers present in an array that are greater than or equal to 7
                {8,,11,14,15,17,19};

       Step 2 : now which is the smallest number among these numbers
                8
                Therefore our answer is equal to 8
                ceiling of number 7 = 8.
                      similarly   10 = 11.
                                  5 = 6.
                                  14 = 14.

     */

    // Finding ceiling of a number using Linear Search

    public static void main(String[] args) {

       int[] arr = {898,87,76,66,43,23,19,17,9,8,7,5,3};
       int target = 40;



       int ans =  ceiling(arr, target);
        System.out.println( ans );
    }

     static int ceiling(int[] arr, int target) {

         boolean isAsc = arr[0] < arr[arr.length-1];

        if (isAsc) {
            for (int i = 0; i < arr.length; i++) {   // Itrate through all the elements in the array

                if (arr[i] >= target) {        // When ever we find an element greater than or equal to target we just
                    // returns that element
                    return arr[i];
                }

            }
        }
        else{
            for (int i = arr.length-1; i >= 0; i--) {   // Iterate through all the elements in the array

                if (arr[i] >= target) {        // When ever we find an element greater than or equal to target we just
                    // returns that element
                    return arr[i];
                }

            }



        }
      return -1;

    }
}
