package com.Tut8;

import java.util.Arrays;

//    FUNCTION OVERLOADING = when functions with same name can exist if parameters are different.
  //    overloading happens when program is compiled
  //    For function overloading to happen either the number of arguments should be different or type of arguments should be different.
public class FunctionOverloading{

    //overloading with varargs

    public static void main(String[] args) {

        print(1 ,3,5,6,7,54);

        print("Hello","World", "I","am","coming");




    }

     static void print(String ...s) {
         System.out.println(Arrays.toString(s));
    }

    static void print(int ...v) {
           System.out.println(Arrays.toString(v));
      }


  }
