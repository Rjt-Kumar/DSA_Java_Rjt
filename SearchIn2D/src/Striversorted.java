public class Striversorted {
/*
      If the 2D array is not sorted then apply linear search.

      If it is sorted then see in which manner it is sorted.
         1: when first element is greater than the last element of the preceeding row.
         2: only sorted in the row manner, that is if converted into a 1D array it will not be sorted.

         for 1st one we can use kunal's method or striver's method( converting the array into 1D imaginary array ).
 */
public static void main(String[] args) {


}
    public static boolean Kunal( int[][] arr, int target ){

        int start = 0;
        int end = arr[0].length - 1;

        while ( start < arr.length && end >= 0){

            if ( arr[start][end] == target ){

                return true;

            }else if ( arr[start][end] > target ){

                end--;

            }else {

                start++;

            }

        }
        return false;
    }
    public boolean Striver( int[][] arr, int target ){

    int row = arr.length;
    int col = arr[0].length;

    int start = 0;
    int end = arr[0].length - 1;

    while ( start <= end  ){

        int middle = start + ( end - start )/2;

        if( arr[middle/col][middle%col] == target ){  return true;}

        else if ( arr[middle/col][middle%col] > target ){  end--; }

        else { // arr[middle/col][middle%col] < target

            start++;

        }
    }

    return false;

    }

}
