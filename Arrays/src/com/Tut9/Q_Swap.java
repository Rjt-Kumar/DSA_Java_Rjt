package com.Tut9;

import java.util.Arrays;

public class Q_Swap {

    public static void main(String[] args) {

    int[] arr = {1 , 3, 5, 6,7 };
    swap(arr,1,2);
        System.out.println(Arrays.toString(arr));
    }

     static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;


    }


}
