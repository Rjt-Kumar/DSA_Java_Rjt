package Arr;

import java.util.Arrays;

public class arryastostring {

    public static void main(String[] args) {

        int number = 123;
        int count = 0;
        int evenDigits = 0;
        while ( number > 0 ){

            number = number / 10;
            count++;

        }

        System.out.println("Number of digits = " + count);
        }

    }



