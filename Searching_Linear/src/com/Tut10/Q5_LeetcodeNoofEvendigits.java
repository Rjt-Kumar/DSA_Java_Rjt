package com.Tut10;

public class Q5_LeetcodeNoofEvendigits {

    // Here we are given an array suppose {12,23,3,567,3466}
    // So we have to find out how many numbers are there which contains even numbers of digits.
    // Here output will be 3.
    public static void main(String[] args) {
        int[] arr = {12, 3, 543, 6443,23,2553,43,3,3,45,43,4,35};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            int numberofdigits = NumberOfDigits(arr[i]);

            if (numberofdigits % 2 == 0) {

                count++;

            }
        }
        System.out.println(count);
    }

    static int NumberOfDigits(int number) {

        int count = 0;

        while (number > 0) {

            number = number / 10;
            count++;

        }
        return count;


    }




    }



