package com.Tut8;

import java.util.Scanner;

public class Sumoftwonumbers {

    public static void main(String[] args) {

       // sum();
        int sum = sum1();
        System.out.println(sum);


    }
           // void type function
    static void sum() {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = a + b;
        System.out.println("The sum is " + ans);
    }
          // return int type function

    static int sum1(){

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = a + b;
        return ans;
    }



}


