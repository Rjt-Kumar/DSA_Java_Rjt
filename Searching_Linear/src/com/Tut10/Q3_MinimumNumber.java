package com.Tut10;

public class Q3_MinimumNumber {

        //Find minimum element in array

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,35,6,4625,6876,456,7,4};

        System.out.println( minimum(arr));
    }

    //Returning the minimum value

    private static int minimum(int[] arr) {
        int min = arr[0];                       //Assuming that the first one is minimum
        for (int i = 1; i < arr.length; i++ ){

           if(arr[i] < min){
               min = arr[i];
           }

        }

        return min;
    }

}
