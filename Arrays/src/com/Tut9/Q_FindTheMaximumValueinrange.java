package com.Tut9;

import java.util.Scanner;

public class Q_FindTheMaximumValueinrange {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,56,6,7,5,6,45,4,456,34,545};

        byte start = in.nextByte();
        byte end = in.nextByte();
        maximumInRange(arr,start,end);


    }
     //edge cases
     static void maximumInRange(int[] arr, byte start, byte end) {
        //edge case
        if( start > end ){
            int temp = end;
            end = start;       //Just assign the max value to the starting index
            start = end;         // and then check for all the values using a for loop
        }

        int max = arr[start];
        for(int i = (start+1) ; i < end; i++){

            if( arr[i] > max ){
                max = arr[i];
            }

        }
         System.out.println("The maximum value in the current range is  " + max);
    }


}
