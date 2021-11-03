package com.Tut9;



public class MaximumValueInArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,7,65,45};
        maximum(arr);


    }

     static void maximum(int[] arr) {

        int max = arr[0];

        for( int i = 1; i < arr.length; i++){

            if( arr[i] > max ){
                max = arr[i];
            }

        }
         System.out.println("The maximum value in the array is " + max);
    }


}
