package com.QuestionBinarysearch;

import java.util.Arrays;

public class Q4_FirstAndLastPositionOfElement {

    // Given an array of integers nums sorted in ascending order, Find the starting and ending position of a given target value.

    // for example { 5,7,7,8,8,10}
    //     target = 8;
    //     answer = [3,4]
    /*                                     Q: Find starting and ending position of a value in an sorted array
          suppose if target = 6
          then output = [-1,-1]
                                             Here we can solve it by brute force method
          if arr = []                        start a loop from first element and another loop from last element
          then target = 8                    and return when target is found
          ans = [-1,-1]                      But it is not optimized since it's complexity is O(n)

    */

    public static void main(String[] args) {

           int[] nums = {5,7,7,7,7,8,8,10};
           int target = 8;
           int[] ans = searchRange(nums,target);
           System.out.println(Arrays.toString(ans));
    }

//     static public int[] SearchRange(int[] nums, int target){
//
//        int[] ans = {-1,-1};
//
//             // Firstly Check for the first occurrence of target
//         ans[0] = search(nums,target,true); // Searching for the first occurrence
//
//         if( ans[0] != -1){
//             ans[1] = search(nums,target,false); // Searching for the last occurrence
//         }
//
//         return ans;
//     }
//
//     // This function just returns the index value of the target
//     // It updates the value of ans
//    static int search(int[] arr, int target, boolean findStartIndex){
//
//        int index = -1;
//        int start = 0;
//        int end = arr.length - 1;
//
//        while ( start <= end ){
//
//            int middle = start + (end - start)/2;
//
//            if(arr[middle] < target){
//
//                start = middle + 1;
//
//            }else if(arr[middle] > target){
//
//                end = middle - 1;
//
//            }else{
//
//                // arr[middle] == target
//                // Here we will run the loop again
//                // Kyuki humme jo middle element milla hai vo to target ke equal to hai he par aur bhe number hosakte
//                // uske left aur right mai that are equal to the target
//                // for example {5,7,7,7,7,8,8,10}
//                /*    target = 7
//                      here middle = 3
//                      but first occurrence is at 1 and the last occurrence is at 4
//                      so for searching for the start index that is searching left end = middle - 1
//                      and for searching for the last index that is searching right start = middle + 1
//                      and then return index
//                 */
//                index = middle;
//
//                if ( findStartIndex ){  // For searching for the first occurrence
//
//                    end = middle - 1;
//
//                }else{                // For searching for the last occurrence
//
//                    start = middle + 1;
//
//                }
//
//            }
//
//        }//While loop over
//
//       return index;
//
//    }
//
//
//
//










        public static  int[] searchRange(int[] arr, int target) {

            int[] ans = {-1,-1};

            ans[0] = searchLeft(arr,target,true);

            if ( ans[0] != -1 ){  ans[1] = searchLeft(arr,target,false);  }

            return ans;


        }

        public static int searchLeft(int[] arr, int target, boolean searchleft ){

            int start = 0;

            int index = -1;

            int end = arr.length - 1;

            while ( start <= end ){

                int middle = start + (end - start)/2;

                if ( arr[middle] < target ){ start = middle + 1; }

                 else if ( arr[middle] > target ){ end = middle - 1; }

                else{

                    index = middle;

                    if(searchleft){

                        // Search for the first position

                        end = middle - 1;

                    }

                    else {  // Search for the last position

                        start = middle + 1;


                    }

                }


            }// while loop over

            return index;


    }






}
