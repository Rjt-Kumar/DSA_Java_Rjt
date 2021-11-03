package Assignment;

public class MaximumMinimum {

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        int i = arr.length;
        System.out.println(minimum(arr,i));
    }

    public static int minimum( int[] arr, int i){

        // Here we are iterating to the

        if( i == 1 ){  return arr[0];  }

        return  Math.max(arr[i-1],minimum(arr,i-1));

    }
}
