package com.Tut9;

public class BasicOfArrayss {
  // Store a roll number
  //     int a = 38;

  // Store a name
  //     String  name = "Rajat"
  //
  // Store 5 person's roll number
            // Here is where arrays comes handy
            // Arrays are used to store anydata type as a collection

 /*     Syntax   */


   //     DataType[] name_variable = new DataType[size];
     //  We cannot store different datatypes in between of an array.

  //  another syntax
           // int[] ros = {2,4,5,2,5};

   // int[] num;           // Declaration of array  ; num getting defined in stack memory.Happens at compile time.

   // num = new int[5];  //Initiallisation   ; Actually here object is being stored in heap memory.Happens at run time.
   //           //Here 5 is size of the array

//    Index of array : Position of the array which starts from zero
// new : it a keyword to create an object in heap memory.
public static void main(String[] args) {
    int[] arr = new int[5];
    System.out.println(arr[0]); // for an integer array BY default all the elements are 0.
    String[] h = new String[9];
    System.out.println(h[3]); //for an string array by default all the elements are null.

    //    [1,3,4,54,5,5] this array is just a collection of reference variable
    // by default for every reference variable is null.
}



}
