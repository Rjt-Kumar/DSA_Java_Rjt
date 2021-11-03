package com.Tut8;

import java.util.Arrays;

public class ModifingAnArray {

    public static void main(String[] args) {

        int[] arr = {1 , 2, 3, 4};
        changeArr(arr);                 // Here the change in the value of array happened because we have not created a new
        System.out.println(Arrays.toString(arr)); // object we have just change it.
    }
    // Arrays.toString() prints the array
   // if you make a change via this reference variable original arr will be changed because we are not creating new object we are just changing it
     static void changeArr(int[] array) {

        array[0] = 0;
    }

}
