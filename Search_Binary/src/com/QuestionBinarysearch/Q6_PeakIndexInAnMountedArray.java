package com.QuestionBinarysearch;

public class Q6_PeakIndexInAnMountedArray {
    /*
        Q : We have to find the peak index in a mountain array,

          Here mountain array means that firstly the elements of the array will be increasing then decreasing

          for example { 1,2,3,4,5,4,3,2,1}
          so here ans = 4; as after index 4 i.e. after 5 elements are decreasing

          another example {0,1,0};
          here answer = 1;

          These are also known as bitonic array

          That is finding maximum number in the array is the answer.
     */

    public static void main(String[] args) {

        int[] arr = {0, 1, 0};
        int ans = PeakIndex(arr);
        System.out.println(ans);

    }

    static int PeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while( start < end ){

            int middle = start + (end - start)/2;

            if (arr[middle] < arr[middle+1]){
                      // It means that we are currently in the increasing part of the array and middle+1 could
                      // be a possible answer but we need to search on right therefore start = middle + 1;
                start = middle + 1;

            } else{   // Here arr[middle] > arr[middle+1] that is we are in the decreasing part of the array
                      // arr[middle] could be a possible answer but we need to search on the left therefore
                      // end = mid; here we didn't do end = middle - 1; because middle could be a possible answer

                 end = middle;

            }

        }// While loop will violate when start == end both point towards the same index or the element which will be the
        // the maximum element and we can return either start or end.
        return start;

    }   // In the end , start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the two checks
        // Hence, when they are pointing to just one element, that is the max one because that is what the checks say
}       // because of above two checks start and end both will be pointing towards the largest element hence we have to return
        // just start or end.