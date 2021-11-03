package Arr;

public class RotatedArray {

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int target = 7;
        int pivot = pivot(arr);
        if( arr[pivot] == target){
            System.out.println(pivot);
        }
        int searchLeft = BinarySearch(arr,target,0,pivot);
        if(searchLeft == -1){
            int searchRight = BinarySearch(arr,target, pivot+1,arr.length-1);
            System.out.println(searchRight);
        }else {
            System.out.println(searchLeft);
        }
    }

    private static int BinarySearch(int[] arr, int target,int start,int end) {

        while(start <= end){

            int middle = start + (end - start)/2;

            if( arr[middle] > target){

                end = middle -1;

            }else if ( arr[middle] < target){

                start = middle + 1;

            }else{
                // Terget == arr[middle]
                return middle;

            }
        }// While loop end
        return -1;
    }
/*
 F finding pivot :
           since here we don't have a specific target have hence we have to compare
           with the neighbouring element and then return either start or end.

           first we will compare element at middle with it's next element
             if(arr[middle] > arr[middle+1]){

                if middle element is greater than the element at middle+1 then element at middle will be the pivot
                it is because since all the elements are in ascending order except the pivot and pivot+1
                          {3,4,5,6,7,0,1,2}
                consider this array : here we know that every element is smaller than the next element because it is an
                ascending order sorted array except 7 since it is rotated, 7 is the only element greater than next
                element. Hence return middle;

             } else {
                      arr[middle] < arr[middle+1]
              It is the condition for all other elements in the array that are not pivot.
              here we have to check twice. Because all the elements execept 0 in the case would be greater than
              the previous elements.For example if middle = 6 in this array than the maximum element would lie on
              it's right side i.e. start = middle + 1;
              and if middle = 0 then it would be smaller than both it's neighbouring numbers, hence for a maximum element
              since it is rotated array we have to return middle-1;cause behind 0 it's the maximum number

             }

 */

    public static int pivot(int[] arr){

        int start = 0;                  // Finding pivot is same as finding index of maximum number
        int end = arr.length - 1;       // here while loop will end when start and end index both point towards the same
        while (start < end){            // element.

            int middle = start + (end - start)/2;

        }
       return start;
    }


}