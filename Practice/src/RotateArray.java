import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {3,5,3,2,52,2};
        int k = 2;
        System.out.println(arr.length);
        rotateToLeft(arr,k);

        rotateToRight(arr,k);

    }

    public static void rotateToRight(int[] arr, int k ){

        int n = arr.length;
        int[] ans = new int[n];

        int j = 0;
        for ( int i = n-k; i < n; i++ ){

             ans[j] = arr[i];
             j++;

        }


        for ( int i = 0; i < n-k; i++){

            ans[j] = arr[i];
            j++;

        }
        System.out.println(Arrays.toString(ans));
    }

    public static void rotateToLeft( int[] arr, int k){

        int n = arr.length;

        int[] ans = new int[n];

        int j = 0;
        for ( int i = k; i < n; i++){     // Using this for loop we have placed all the elements {3,5,3,2,52,2}
                                          // all the elements after the value of k i.e. if k = 2 all the elements
            ans[j] = arr[i];              // after 3 including 3, will be placed at starting of the new array.
            j++;                          // ans = {3,2,52,2,0,0}

        }
        j = n - k;
        for ( int i = 0; i < k ; i++ ){   // Now we have to just put the first k elements of the original array
                                          // to the last of the answer array.
            ans[j] = arr[i];
            j++;

        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));

    }

}
