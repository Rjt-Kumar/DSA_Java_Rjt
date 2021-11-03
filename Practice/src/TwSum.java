import java.util.Arrays;

public class TwSum {

    public static void main(String[] args) {

        int[] arr =  {1,2,3,4,5,3,1};
        int target = 5;
        int ans = findInMountainArray(34,arr);
        System.out.println(ans);

    }
    public static int findInMountainArray(int target,  int[] arr) {

        int peakIndex = peak(arr);
        if( target == arr[peakIndex]){  return peakIndex;  }
        int leftIndex = BinarySearch(arr,target,0,peakIndex-1);
        int rightIndex = BinarySearch(arr, target,peakIndex + 1,arr.length-1);

        if( leftIndex == -1 ){

            return rightIndex;
        }
        return leftIndex;
    }

    public static int peak(int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while ( start < end ){

            int middle = start + ( end - start )/2;

            if ( arr[middle] < arr[middle + 1]){

                start = middle + 1;
            }else {

                end = middle ;
            }

        }// while loop over

        return start;
    }

    public static int BinarySearch(int[] arr, int target, int start, int end){


        while ( start <= end ){

            int middle = start + ( end - start )/2;


            if( arr[middle]  < target ){

                //Search right
                start = middle + 1;

            }
            else if( arr[middle] > target ){

                //Search left
                end = middle - 1;

            }
            else{
                //Found the answer
                return middle;

            }

        }

        return -1;


    }

}
