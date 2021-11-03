import java.util.Arrays;

public class Intro {
/*
     Searching in a 2D array / martrices unsorted.

 */
public static void main(String[] args) {

    int[][] arr = { {2,5,1} , {23,21,52} , {43,23,53}};
    int target = 21;
    for ( int i = 0; i  < arr.length ; i++) {

        for( int j = 0; j < arr[i].length; j++) {

                if( arr[i][j] == target ) {
                        int[]  ans = {i,j};
                    System.out.println(Arrays.toString(ans));
                 }
        }
        }

    }
}


