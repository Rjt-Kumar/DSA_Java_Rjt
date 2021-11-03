package com.Tut9;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
      //  arr[0] = 1;
      //  arr[1] = 1;
      //  arr[2] = 1;
      //  arr[3] = 1;
      //  arr[4] = 1;

        //Input using loops
        for(int i = 0; i < arr.length ; i++){

            arr[i] = in.nextInt();

        }
        for(int i = 0; i < arr.length ; i++){

            System.out.print( arr[i] + " " );

        }

        System.out.println(Arrays.toString(arr));

    }




}
