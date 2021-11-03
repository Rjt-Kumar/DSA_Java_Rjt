package com.QuestionBinarysearch;

public class Q1_UsingBinarySearch {

    public static void main(String[] args) {

        int[] arr = {2,3,6,7,8,9,13};
        int target = 16;

        int ans = CeilingOfNumber(arr,target);   // Return  the smallest number greater than or equal to
        System.out.println(ans);                 // the target

    }

    static int CeilingOfNumber(int[] arr, int target) {

        // What if the target element is greater than largest element in the array then suppose
        /*
                    arr = {2,3,6,7,8,9,13,15};
                    Find ceiling of 18 = then we return -1;
         */


        int start = 0;
        int end = arr.length-1;


        boolean isAsc = arr[start] < arr[end];    // Checking whether the array is in ascending order or descending
                                                  // order
         if (isAsc){
                      if ( target > arr[arr.length -1] ){// This means that if the target element is greater than the
                                                        // largest element in the array then we return -1;
                          return -1;                    // This will be an edge case
                      }                                 // For ascending order we check target element with the largest value
         } else{                                        // which will be present at the last index of the array
                                                        // For descending order we check target element with the first element
             if ( target > arr[0] ){                    // and return -1;

                 return -1;
             }

         }


        while ( start <= end ){

            int middle = start + ( end - start)/2;

            if( arr[middle] == target ){


                return arr[middle];

            }else if( isAsc ){

                // If the sorted array is in ascending order

                if( arr[middle] > target ){

                    end = middle - 1;

                }else {

                    start = middle + 1;

                }
            }

            else {  // If the sorted array is sorted in descending order

                if( arr[middle] < target ){

                    end = middle - 1;

                }else {

                    start = middle + 1;

                }
            }
        }

        if(isAsc){                              //for ascending order
            return arr[start];  // Here we returned start because at the end of the while loop
        }                       // start is greater than end and if we return end then it will give the number smaller
        else{                   // than the target element i.e. 14 which is incorrect
            return arr[end];    // hence we returned start = 16;

        }                                       //for descending order
                                // Because in descending order when end will be smaller than start
                                // end will have a greater value and since we have to return a value greater
                                // than or equal to target.So we return end in case of descending order




    }


}
