package com.Tut11;

public class Order_Agnostic {

    // Order Agnostic means we are given an sorted array and we dont know if it is ascending or descending
    // Then we apply order agnostic Binary search
    // We have to compare two elements starting element and ending element

    // if ( start > end ) = descending      // We did not compare two continous elements because they could be equal
    // if ( start < end ) = ascending       {2,2,2,2,2,2,4,5,6,7}
                                            // Instead of comparing 2 with 2 we compare first element and last element

    public static void main(String[] args) {

     //   int[] arr = {2,3,4,5,6,67,68,78,89};
        int[] arr = {898,87,76,66,43,23,19,17,9,8,7,5,3};
        int target = 66;


        int ans = OrderAgnosticBinarySearch(arr,target);
        System.out.println(ans);
        }

    static int OrderAgnosticBinarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];   // For checking if the array is in ascending order or in descending order

        while ( start <= end ){

            int middle = start + (end - start)/2;

            if( arr[middle] == target ){      // This condition will be true for both ascending and descending order.

                return middle;
            }

            if(isAsc){

                if( arr[middle] < target ){

                    start = middle + 1;

                }else {

                    end = middle -1;

                }

            }
            else{

                if( arr[middle] > target ){

                    start = middle + 1;

                }else{

                    end = middle - 1;

                }
            }

        }
        return -1;


    }


}





