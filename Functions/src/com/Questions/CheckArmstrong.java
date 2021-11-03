package com.Questions;

import java.util.Scanner;

public class CheckArmstrong {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
   //     int n = in.nextInt();
        int start = in.nextInt();
        int end = in.nextInt();
        for(int i = start;i <= end; i++){

            if(printArmstrong(i)){
                System.out.println(i);

            }


        }
      //  System.out.println( printArmstrong(n) );
    }

    static boolean printArmstrong(int n) {
           int ans = 0;
           int original = n;
        while(n > 0){

            int rem = n % 10;
            ans += rem*rem*rem;
            n /= 10;

        }

        return ans == original;
            }

            }





