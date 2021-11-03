package com.QuestionBinarysearch;

public class Q3_SmallestLetterKunalanswer {



    public static void main(String[] args) {

        char[] arr = {'a','b','c','d'};
        char target = 'e';

        char ans = smallestLetter(arr,target);
        System.out.println(ans);


    }

    static char smallestLetter(char[] arr, char target) {

        int start = 0;
        int end = arr.length - 1;

        while( start <= end ){

            int middle = start + (end-start)/2;
            if( target < arr[middle] ){

                end = middle - 1;

            } else{

                start = middle + 1;

            }

        }

        return arr[start % arr.length];  /*  Here we have returned start % arr.length
                                             because it returns start if start is less than arr.length
                                             and returns 0 if start is equal to arr.length

                                             for example {c,d,e,f}
                                             if target = e
                                             the value of start when the while loop violates is start = end + 1
                                             i.e. start = 3
                                             and start % arr.length = 3 % 4 = 3
                                             therefore ans = arr[3] == f

                                             if target = g
                                             then the value of target when the while loop violates is
                                             start = 4 which is equal to arr.length
                                             and start % arr.length = 0
                                             then we return arr[0]
                                             answer = c    */

    }
}
