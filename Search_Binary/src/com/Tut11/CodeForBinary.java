package com.Tut11;

public class CodeForBinary {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,12,14,15,35,46,57,543};
        int target = 128;
        int ans = BinarySearch( arr,target );
        System.out.println( ans );


    }
      //Return index
      //Return -1 if element is not present
    static int BinarySearch(int[] arr, int target){

       int start = 0;
       int end = arr.length - 1;



        while ( start <= end ){

            int middle = start + ( end - start )/2;  // Here we can also do middle = start + end / 2 ;
                                                     // but since start + end could exceed the range of integer
                                                     // we use middle = start + (end - start)/2;

           if( arr[middle]  < target ){

           //Search right
           start = middle + 1;

       }
           else if( arr[middle] > target ){

               //Search left
               end = middle - 1;

           }
           else{
              //Found the answer
               return middle;

           }

       }

        return -1;

    }




}
