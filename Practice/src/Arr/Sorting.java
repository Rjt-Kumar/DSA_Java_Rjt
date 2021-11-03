package Arr;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5};
       // Bubble(arr);
       // SelectionSort(arr);
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Bubble(int[] arr){

        // In this we compare adjacent elements and swap if they are not sorted.

        for (int i = 0; i < arr.length ; i++){

            boolean swapped = false;

            for (int j = 1; j < arr.length - 1 - i; j++){
                  // Here we are checking it if they are sorted or not.

                if (arr[j] < arr[j-1]){

                    swap(arr,j,j-1);
                    swapped = true;
                }

            }  if (!swapped){ break; }

        }


    }

    public static void SelectionSort(int[] arr){

        // In this sorting method we find the max element in the current range and put it in the last index of that current range

        for (int i = 0; i < arr.length ; i++){

            int lastIndex = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr,0,lastIndex);
            swap(arr, lastIndex, maxIndex);

        }

    }

    public  static int getMaxIndex(int[] arr, int start, int end) {

        int maxIndex = start;

        for (int i = start; i <= end ; i++){

            if (arr[maxIndex] < arr[i]){

                maxIndex = i;

            }
        }
        return maxIndex;
    }

    public static void InsertionSort(int[] arr){
        // In this sorting method we iterate through the array.
        // Then iterate one more loop which starts from i+1; and decrements till greater than 0.
        // And insert it into the correct index.
        for ( int i = 0 ; i < arr.length-1 ; i++ ){

            for ( int j = i + 1 ; j > 0 ; j-- ){

              if (arr[j] < arr[j-1]){

                  swap(arr,j,j-1);

              }else {

                  break;

              }

            }


        }


    }

    public static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;


    }
}
