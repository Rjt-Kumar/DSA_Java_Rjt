package Assignment;

import java.util.Arrays;

public class sumTriangleofArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
       // sum(arr,0);
        triangle(arr);
    }
      /* MY SOLUTION
    public static void sum( int[] arr ,int count ){

        int[] ans = new int[arr.length-1];

         if ( arr.length == 1 ){

             return;
         }

         // To add two elements and set it equal to an element in the newly formed array at that iteration
        for ( int i = 0; i < arr.length-1; i++){

            ans[i] = arr[i] + arr[i+1];

        }


        sum(ans ,count+1);

        System.out.println(Arrays.toString(ans));
        if( count == 0){
            System.out.println(Arrays.toString(arr));
        }
*/

    public static void triangle( int[] arr){

        if ( arr.length == 0){

            return;

        }

        // creating a new array at each iteration of length, one smaller than the previous length
        // and assigning the element of the array as the sum of consecutive elements of previous array i.e. arr
        // and pass ans the new array as the parameter.

        int[] ans = new int[arr.length - 1];

        for ( int i = 0; i < arr.length - 1;i++ ){

            ans[i] = arr[i] + arr[i+1];

        }

        triangle(ans);
        // here we have printed arr as in the starting of the function we have passed arr not ans
        // and print arr using back tracking
        System.out.println(Arrays.toString(arr));

    }
    }

