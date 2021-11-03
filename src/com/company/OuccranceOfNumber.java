package com.company;

import java.util.Scanner;

public class OuccranceOfNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int  count = 0;
        int r = 1;
        while (number > 0){   // aisa isleye hua kyuki number khatam hona chaiya na ki remainder (number > 0)
                              // we cannot use r != 0 bcz 1707 mai remainder will be 0 only after checking first time
             r = number % 10;

            if (r == 7) {
             count++; }

            number = number / 10;

        }

        System.out.print("The number of 7 occuring in " + " is " + count +   " times.");

    }

    }


