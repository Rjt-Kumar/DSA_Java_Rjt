package com.QuestionBinarysearch;

public class Q7_SearchingInMountain {
 /*
     Q : Searching a target in a mountain array

             suppose arr = {2,3,4,5,6,4,3,2};
             target = 4;
             since 4 is present at index 2 as well as at index 5 ;
             in this case we return index 2 the minimum index
             and if the element is not present in the array return -1.

             target 8;
             ans = -1;

  ANSWER : To solve this question we have first created 3 functions

         1 : FindIndex - which will give us the index of the target in the mountain array.

         2 : FindMax - This function gives us the index of the maximum element in the mountain array,
                       i.e. it is basically the code of peek index in a mountain array and returns us
                       the index of the maximum element in array - it works on just simple two checks
                                      1: while(start < end) check if arr[middle] is greater or lesser than arr[middle+1]
                                      2: if (arr[middle] < arr[middle+1]) = Increasing part of the array start = middle + 1;
                                      3: if (arr[middle] > arr[middle+1]) = Decreasing part of the array end = middle;
                                          the loop will end when start = end and that index will be the maximum element in the array

         3 : BinarySearch - It is simple binary search which works on both descending and ascending part of the array
                            based on the value of checkLeft if it is true then the check will on the left side that is on the increasing side
                            if the value is false then the check will be on the right side that is decreasing part of the array

         LOGIC --> hum pehle max index find karenge aur usse target element check karenge agar equal hua to return kardenge
                   max ki index nahi hua to,ya to vo max ke left mai hoga nahi to right mai hoga, we will check both the sides
                   aur dono side check karke ( Binary Search ) index return kardenge , agar samjho ek side vo target present nahi
                   hai to hum Max value of integer return kardenge , aur agar dono jageh vo target nahi milla to -1 return kardenge
                   suppose element was present both on left and right then we will return the left index since it will be less than the
                   right index. ELse print -1.
  */

    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6,4,3,2,1};
        int target = 6;
        int ans = FindIndex(arr,target);
        System.out.println(ans);
    }

     static int FindIndex(int[] arr, int target) {

        int IndexOfMax = FindMax(arr);
        if (target == arr[IndexOfMax]){

            return IndexOfMax;    // It means that the max element in the array is the array

        } else {
              // Here we will search in both the decreasing and the increasing part of the array
            int IndexLeft = BinarySearch(arr,target,true);
            int IndexRight = BinarySearch(arr,target,false);
            if(IndexLeft < IndexRight){   // It means that element is present in the left side of the array

                return IndexLeft;

            }else if (IndexLeft > IndexRight){ // It means that element is present in the right side of the array

                return IndexRight;

            }else {
                           // IndexLeft is equal to IndexRight that is the target is not present hence return -1;
                return -1;

            }
        }
    }
    static int FindMax(int[] arr){

      int start = 0;            // Simple code for finding the peek value in the mountain array
      int end = arr.length - 1;

      while (start < end){

          int middle = start + (end - start)/2;

          if(arr[middle] < arr[middle+1]){  // Here we are searching in the increasing part of the array

              start = middle + 1;

          }else {   // arr[middle] > arr[middle + 1]
                    // Here we are searching in the decreasing part of the array
              end = middle;

          }

      } // While loop will terminate when start = end  and both will pointing towards the maximum element
        return start;
    }

    static int BinarySearch(int[] arr,int target,boolean CheckLeft){

       if(CheckLeft){
           int start = 0;
           int end = FindMax(arr);
           while(start <= end){

               int middle = start + (end - start)/2;

               if (arr[middle] < target){ // It means that we are seaching in the right side of the array.

                   start = middle + 1;

               }else if( arr[middle] > target){  // It means that we are searching in the left side of the array.

                   end = middle - 1;

               }else{
                   // This means that we have found the target
                   return middle;

               }
           }
           return Integer.MAX_VALUE;    // Here we are returning the maxvalue kyuki upper ek
       } else{                          // comparison hoga jisma chote valle index he print hoge.

           int start = FindMax(arr);
           int end = arr.length - 1;
           while(start <= end){

               int middle = start + (end - start)/2;

               if (arr[middle] > target){ // It means that we are seaching in the right side of the array.

                   start = middle + 1;

               }else if( arr[middle] < target){  // It means that we are searching in the left side of the array.

                   end = middle - 1;

               }else{
                   // This means that we have found the target
                   return middle;

               }
           }
           return Integer.MAX_VALUE;

       }

    }






}
