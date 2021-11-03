package com.Tut8;

import java.util.Scanner;

public class Questions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        prime(num);

    }

     static void prime(int a) {

        if( a == 1 ){
            System.out.println("It is just one.");
        }

        if( a == 2){
            System.out.println("Prime");
        }
        if ( a >= 3){

            int n = 2;

            while( n * n <= a ){
                if( a % n == 0){
                    System.out.println("Non Prime");
                    break;
                }
                n++;

            }
            if(n * n > a){

                System.out.println("Prime");
            }

        }



    }

}
