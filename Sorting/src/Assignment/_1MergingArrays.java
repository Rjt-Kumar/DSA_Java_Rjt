package Assignment;

import java.util.Arrays;



public class _1MergingArrays {

    public static void main(String[] args) {
        int[] nums1 = {1,2,4,0,0,0};
        int m = 3;
        int[] nums2 = {2,3,5};
        int n = 3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n ; i++){

            nums1[m+i] = nums2[i];

        }
        InsertionSort(nums1);
    }

    public static void InsertionSort(int[] arr){

        for (int i = 0; i <= arr.length-2; i++){

            for (int j = i+1; j > 0; j--){

                if (arr[j] < arr[j-1]){

                    swap(arr,j,j-1);

                }else {

                    break;

                }
            }
        }
    }

     static void swap(int[] arr, int first, int second) {

    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;

    }


}
