package com.Tut8;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {

        get(1,2,3,4,5,6,67,7,65674,4,564);
        multiple(15,5, 'a','w','s');
    }

     static void get(int ...v) {   //We use varargs when we dont know how many arguments will our function take.
                                   //It stores all the value as an array.

        // System.out.println(Arrays.toString(v));

    }

     //We can create multiple arguments with including varargs by

    static void multiple(int a, int b, char ...s){
        //Variable length arguments should always come in the end.

    }



}
