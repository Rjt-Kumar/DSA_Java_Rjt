package com.Tut9;

import java.util.Arrays;
import java.util.Scanner;

public class MultyDimensionalArray {

    public static void main(String[] args) {

        /*
             1 2 3
             4 5 6
             7 8 9
        */

        // Syntax of 2D array

        //    int[][] arr = new int[ /* number of row */ ][ /* number of columns */ ];

        // Declaring number of coloumns is not always mendatory but declaring number of rows is necessary.

//            int[][] arr = {
//
//                    {1,2,3},
//                    {4,5,6},
//                    {7,8,9}
//
//            };
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[1][2]);
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][4];

        //INPUT

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                arr[row][col] = in.nextInt();

            }
        }

        //OUTPUT

//        for (int row = 0; row < arr.length; row++) {
//
//            for (int col = 0; col < arr[row].length; col++) {
//
//                System.out.print( arr[row][col] );
//
//            }

           // System.out.println();
            for( int[] a : arr ){  // For every element in arr every element is an array.

                System.out.println(Arrays.toString(a));


            }




        }

    }
