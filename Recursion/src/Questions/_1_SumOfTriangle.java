package Questions;

import java.util.Arrays;

/*

      Given an array of integers, print a sum triangle from it such that the first level has
      all array elements. From then, at each level number of elements is one less than the previous
      level and elements at the level is be the Sum of consecutive two elements in the previous level.

  Example :


   Input : A = {1, 2, 3, 4, 5}
   Output : [48]
            [20, 28]
            [8, 12, 16]
            [3, 5, 7, 9]
            [1, 2, 3, 4, 5]

 */
public class _1_SumOfTriangle {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        sum( arr,arr.length - 1);

    }

    private static void sum(int[] arr, int end) {




        if ( arr.length == 1 ){

            System.out.println(Arrays.toString(arr));

        }



    }


}
