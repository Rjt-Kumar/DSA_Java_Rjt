package Arr;

public class pivot {

   public static void main(String[] args) {

      int[] arr = {1,3};
      int target = 3;
      System.out.println(pivot(arr));
      System.out.println(search(arr,target));
   }

   public static int search(int[] arr, int target) {

      int pivot = pivot(arr);
      if(arr[pivot] == target){ return pivot; }

      int ans = check(arr,target,0,pivot);

      if(ans == -1){

         ans = check(arr,target,pivot,arr.length-1);

      }

      return ans;

   }

   public static int   pivot(int[] arr){

      int start = 0;
      int end = arr.length - 1;

      while( start < end ){

         int middle = start + (end - start)/2;

         if (arr[middle] > arr[middle+1]){ return middle+1;}

         if (middle > start && arr[middle] < arr[middle-1] ){ return middle-1; }

         else if (arr[middle] < arr[middle+1]){
            // we are in sorted part of the array
// here we have to check if we are in left or right side of the pivot to check we compare
            // it with the element at the start
            if(arr[start] > arr[middle]){ end = middle - 1; }

            else{ start = middle + 1; }

         }

      }// while loop over

      return 0;
   }

   public static int check(int[] arr, int target , int start , int end ){


      while(start <= end ){

         int middle = start + (end - start)/2;

         if ( arr[middle] < target ){ start = middle + 1; }

         else if ( arr[middle] > target ){ end = middle - 1; }

         else {  return middle;

         }



      }

      return -1;
   }



}
