import java.util.Arrays;

public class SearchingInSorted2D {

    public static void main(String[] args) {

        int[][] arr = { {1 ,2,3} , { 4,5,6 } , { 7,8,9} };
        int target = 6;
       int[] ans = Search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] Search(int[][] arr, int target) {

        int row = 0;
        int col = arr[row].length - 1;

        while ( row < arr.length && col >= 0 ){

            if ( arr[row][col] == target ){ return new int[] {row,col} ;}

            else if ( arr[row][col] > target ){
                // Ignore that column since all the elements in that col will be greater than the target element
                col--;

            } else { // The target element is smaller than the current element. Hence we ignore the current row and move
                     // to the next one .
                row++;

            }


        }
        return new int[]{row,col};
    }


}
