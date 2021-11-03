package com.Tut10;

public class Q6_MaxWealth {

       //{ {1,2,3} , {3,4,5} }
       //Here the wealth of the first customer is 3+2+1 = 6.
       // and the wealth of second customer is 3+4+5 = 12.
    public static void main(String[] args) {

        int[][] arr = { {32,32,2} , {1,2,3}  , {4,5,6} , {34,3,3} };

        System.out.println(sumOfElementsOfarray(arr));


    }

    static  int  sumOfElementsOfarray(int[][] arr) {

        int max = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++){
            int sum = 0;
            for ( int col = 0; col < arr[row].length; col++){

                sum = arr[row][col] + sum ;     // Here we take the sum of all the elements of the array
                                                // and compare them by the max variable
            } if(sum > max){                    // which is assigned as minimum value
                max = sum;                      // hume sum ko vapis 0 karna padta hai taki agle loop mai
                                                // mtlb jab agle array ke elements add ho rahe ho tab vo pichle
            }                                   // array ke sum se combine na ho
        }
         return max;

    }


}
