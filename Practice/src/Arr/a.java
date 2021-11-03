package Arr;

import java.util.Arrays;

public class a {

    public static void main(String[] args) {
        int[] arr = {3,5,4,2,1};
        //Bubble(arr);
        //selection(arr);
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

     // All sorting algorithms

// 1 : Bubble sort

   static public void Bubble(int[] arr){
        boolean swapped = false;
        for(int i = 0; i < arr.length; i++){

            for (int j = 1; j < arr.length - i; j++ ){

                if (arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                    swapped = true;
                }

            }if (!swapped) {
                break;
            }
        }
   }

   static public void swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

   }

// 2 : Selection sort

    static public void selection(int[] arr){

        for (int i = 0; i < arr.length - 1; i++ ){
            // Find the maximum element and replacing it with the last index.
            int lastIndex = arr.length - 1 - i;
            int maxIndex = getMax(arr,0,lastIndex);
            swap(arr,lastIndex,maxIndex);


        }


    }

     static int getMax(int[] arr, int start, int lastIndex) {

        int max = start;
        for (int i = start ; i <= lastIndex; i++){

            if (arr[i] > arr[max]){
                max = i;
            }

        }

        return max;
    }


// 3 : Insertion sort

    public static void insertion(int[] arr){

        for (int i = 0; i < arr.length - 1; i++){

            for (int j = i + 1; j > 0 ; j--){

                if (arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }


        }




    }


}
