package com.company;

import java.util.Scanner;

public class ReverseOfNumber {

    public static void main(String[] args) {

              // BY ME

       Scanner in = new Scanner(System.in);
       // int number = in.nextInt();
     //  int r;
     //  while ( number > 0){
     //      r = number % 10;
     //      System.out.print(r);
     //      number = number / 10;
     //  }

        int number = in.nextInt();
        int ans = 0;

       while ( number > 0 ) {

           int remainder = number % 10;
           ans = ans * 10 + remainder;
           number /= 10;

       }
        System.out.println(ans);

       }


    }



