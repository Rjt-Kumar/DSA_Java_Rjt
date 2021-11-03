package com.company;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a place till where you want to print Fibonacci series.");

                            // MY METHOD

      int place = in.nextByte();
    //   int n1 = 0, n3 = 0;
    //   int n2 = 1;
    //   if ( place == 0 ) {
    //       System.out.println("The fibonacci number at " + place + " is : " + 0);
    //   } else if ( place == 1 ) {
    //       System.out.println("The fibonacci number at " + place + " is : " + 1);
    //   } else {
    //       for(int i = 2; i <= place ; i++){
    //           n3 = n2 + n1;
    //           n1 = n2;
    //           n2 = n3;
    //       }
    //            System.out.println("The fibonacci number at " + place + " is : " + n3);
    //   }

        int a = 0;
        int b = 1;
        int count = 2;

        while ( count <= place ){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println("The fibonacci number at " + place + " is : " + b);
    }


}
