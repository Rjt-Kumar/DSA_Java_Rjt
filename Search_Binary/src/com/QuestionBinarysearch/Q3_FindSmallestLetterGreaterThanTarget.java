package com.QuestionBinarysearch;
                           //By ME
public class Q3_FindSmallestLetterGreaterThanTarget {

    // Here we are given with an array of letters which is increasing in order and a character target,
    // return the smallest character in the array that is larger than target.

    /* arr = { "c", "d", "e"}

      target = 'b';
      now ans = 'c'

      Note : If there is no element present in the array that is greater than the target element than we
             have to return the first element ( The letters wrap around )

         arr = {"d","e","f","g","h"};
         if target = "z";
         Since there is no element present in the array that is greater than the target element
         Therefore we have to return the first element
         answer = "d";

     */
    public static void main(String[] args) {          // All the code will be same as ceiling of a number for ascending order
                                                      // the only difference will be that when target element is equal to an element in the array
       char[] arr = {'d','e','f','g','h','j'};    // we will return the next element that is the greater element
       char target = 'h';                             // which means we will return the element at the index middle+1
       char ans = SmallestLetterGreaterThanTarget(arr,target);// So when arr[middle] == target we return arr[middle+1]
        System.out.println(ans);                      // And if the element is not present in the array we return
    }                                                 // arr[start]. Here we returned start because when the while loop will violate, the value of start will be
                                                      // greater than the end and since we want to return the letter greater than the target element we return arr[start]
    static char SmallestLetterGreaterThanTarget(char[] arr, char target) {


        int start = 0;
        int end = arr.length - 1;

        if(target > arr[arr.length-1]){       // Here we have to check if there is any element present in the array
            return arr[start];                // that is grater than the target element.
        }                                     // So we check it with the largest element
        while (start <= end) {                // if not present then we return the first element.

            int middle = start + (end - start) / 2;

            if (arr[middle] == target) {

                return arr[middle+1];

            } else {              // The most of the code is equal to the ceiling of the number
                                  // just there is a difference in the return refer to lines from 23 to 30.
                if (arr[middle] > target) {

                    end = middle - 1;

                } else {

                    start = middle + 1;

                }
            }
        }

        return arr[start];

    }
}
