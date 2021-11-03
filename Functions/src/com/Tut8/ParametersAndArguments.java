package com.Tut8;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ParametersAndArguments {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
              // int type
      //int a = in.nextInt();
       //int b = in.nextInt();
       // System.out.println(sum(5 , 6));
        String name = in.next();
        System.out.println(greet(name));


    }



    static int sum(int a,int b){

        return a+b;

     }

     static String greet(String a){

        return "Hello " + a;

     }


}
