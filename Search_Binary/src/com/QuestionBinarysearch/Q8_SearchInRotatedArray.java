package com.QuestionBinarysearch;

public class Q8_SearchInRotatedArray {
/*
    Q : Binary Search in a rotated array



 */
public static void main(String[] args) {

    int[] arr = {1,3};
    int target = 3;
    int pivot = FindPivot(arr);
    int searchLeft = BinarySearch(arr,target,0,pivot - 1);
    int searchRight = BinarySearch(arr,target,pivot + 1,arr.length - 1);
    if(target == arr[pivot]){
        System.out.println(pivot);
    } else if ( searchLeft != -1 ){

        System.out.println(searchLeft);

    }  else {

        System.out.println(searchRight);
    }
}

public static int BinarySearch(int[] arr,int target,int start ,int end){

    while( start <= end ){

        int middle = start + (end - start)/2;
        if( arr[middle] < target){

            start = middle + 1;

        }else if (arr[middle] > target){

            end = start - 1;

        }else{

            return middle;

        }

    }

    return -1;

}
      /*      How to find pivot ?

       */

   public static int FindPivot(int[] arr){

    int start = 0;
    int end = arr.length - 1;

    while (start <= end){

        int middle = start + (end - start)/2;

        if( arr[middle] > arr[middle+1]){

            return middle;
        }

        if ( middle > start && arr[middle] < arr[middle-1]){

            return middle-1;
        }

        if ( arr[start] > arr[middle]){
          // It means that the middle element is in right side of the pivot and on the right side of the middle,
          // all the elements would be smaller than the pivot,Since pivot lies on the left side. Hence
            end = middle - 1;
        }

        if (arr[start] < arr[middle]){
          // It means that the middle is in left side of the pivot and the pivot lies on right side of the middle
          // Hence
            start = middle + 1;  // yaha par hum vo vala case nahi lere hai jisme humare start aur middle dono
        }                        // pivot ke right side mai hai kyuki aisa ho he nahi sakta. Start will never cross pivot.


    }
    return -1;
   }
























}
