package com.Tut9;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionlArraylist {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>>  list = new ArrayList<>();
        //Initially it is going to be empty first we have to initialize because by default all value will be null

        //Initialization
        for(int i = 0; i < 4; i++){
                                          //Here this initialization is similar to that of
                                          // int[][] arr = new int[3][];
            list.add(new ArrayList<>());
        }      //Here 4 defines the number of that 4 array will be there inside the array list
                //FIRST WE HAVE TO ADD SOME LIST OVER HERE.

        // add elements

        for(int i = 0;i < 4; i++){

            for( int j = 0; j < 3 ; j++){

                list.get(i).add(in.nextInt());
               //Here we are saying that get(i) but if we have not initialezed it than we will not getit.
                //At starting it is null.
            }
        }
        System.out.println(list);
    }


}
