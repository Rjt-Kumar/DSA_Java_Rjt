package com.QuestionBinarysearch;

public class Q5_SearchingInInfiniteArray {

/*  Q : Position of an element in an infinite array that is we will not use the length of the array

    suppose arr = {2,3,4,5,6,7,8,9,13,14,15,16,18.23,26,28.30};
    here we don't know the size of the array. We will not use array.length formula to initialise end. Instead we will search in chunks by increasing it
    so we will apply binary search as it is sorted.
    Hum pehle start ko 0 aur end ko 1 karenge aur 2 space ka box banyenge
    if target element is greater than the end element ( arr[end] < target) if this statement is true
    than our target element is not present in that box
    Hence we will increase the space of our searching box 2 times that is (start = end + 1)
    and (end = previous end + 2 * space of the previous space
    i.e. end = end + (end - start + 1) * 2;

 */

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,13,15,17,19,23,25,27,29,30};
        int target = 1;

        int ans = FindChunk(arr,target);
        System.out.println(ans);

    }

    static int FindChunk(int[] arr, int target) {  // Here finding chunk means finding the range where our target element is
        int start = 0;                             // present and then applying binary search in that range
        int end = 1;                               // that's why we created this function FindChunk and then called the binarySearch function on the start and end index that we have found.
        while( arr[end] < target ){ //It means that target is not present in that chunk between start and end
                                    // So here we increase the space of the chunk by double
           int newStart =  end + 1;
           end = end + ( end - start + 1) * 2;  // here we are going to double the previous space and start it from end + 1;
           start = newStart;                    // so newEnd = previousEnd + previousSpace * 2 ;
                                                // previous space = end - start + 1;
        }
        int ans = BinarySearch(arr,target,start,end);

        return ans;
    }

     static int BinarySearch(int[] arr, int target, int start, int end) {

        while( start <= end ){             // Here simple binary search is applied on the range that we have found
                                           // from start till end since we don't know the size of the array
            int middle = start + (end - start)/2;  // and simply return middle which is then stored as ans in the above
                                                 // FindChunk function and return ans
            if (arr[middle] < target){

                start = middle + 1;

            }else if ( arr[middle] > target ){

                end = middle - 1;

            }else{

                return middle;

            }
        }//While loop over

         return -1;

    }


}
