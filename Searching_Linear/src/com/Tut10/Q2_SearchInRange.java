package com.Tut10;

import java.util.Scanner;

public class Q2_SearchInRange {

      //Search for a number in an array between a given range.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int number = 9;
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println( linearSearch(arr,number,start, end));

    }

     static boolean linearSearch(int[] arr, int number, int start, int end) {

        if(arr.length == 0){
            return false;
        }
        for( int i = start; i < end; i++ ){

            if( arr[i] == number){return true;}

        }

        return false;
    }

}
