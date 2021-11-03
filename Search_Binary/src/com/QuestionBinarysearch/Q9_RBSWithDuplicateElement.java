package com.QuestionBinarysearch;

public class Q9_RBSWithDuplicateElement {

    /*
       The main difference here will be of finding pivot and all the rest of the code will be same.

     */


    public static void main(String[] args) {

        int[] arr = {6,6,6,6,7,0,1,2,3,4,5,6};
        int target = 6;
        int pivot = FindPivot(arr);


        int searchLeft = BinarySearch(arr,target,0,pivot - 1);
        int searchRight = BinarySearch(arr,target,pivot + 1,arr.length - 1);
        if(target == arr[pivot]){
            System.out.println(pivot);
        } else if ( searchLeft != -1 ){

            System.out.println(searchLeft);

        }  else {

            System.out.println(searchRight);
        } }


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

    static public int FindPivot(int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while ( start <= end){

            int middle = start + (end - start)/2;

            if ( middle > start && arr[middle] < arr[middle-1]){
                return middle - 1;
            }

            if ( middle < end && arr[middle] > arr[middle+1]){
                return middle;
            }

            if (arr[start] == arr[middle] && arr[middle] == arr[end] ){
                // all the three have same value hence we will ignore these values.
                // But before ignoring we have to first check if the start and end elements are pivot or not
                if( arr[start] > arr[start + 1]){
                    return start;
                }else{
                    start++;
                }
                if ( arr[end] < arr[end - 1]){
                    return end - 1;
                }else{
                    end--;
                }
                 // Left side is sorted pivot is in right side
            }else if( arr[start] < arr[middle] || (arr[start] == arr[middle] && arr[middle] > arr[end])){
                start = middle + 1;
            }else {
                end = middle - 1;
            }
        }

        return -1;

    }

}
