import java.util.Arrays;

//public class AllSorting {

    // all the sorting algorithms

//    public static void main(String[] args) {
//
//        int arr[] = { 2,4,5,3,6,1,7};
//        // bubbleSort(arr);
//        // selectionSort(arr);
//        //insertionSort(arr);
//        //cyclicSort(arr);
//
//        System.out.println(Arrays.toString(arr));
//    }
//    // 1 : Bubble sort
////
////    public static void bubbleSort( int[] arr){
////
////        for( int i = 0; i < arr.length; i++){
////
////            for( int j = 1; j < arr.length - 1 - i; j++){
////                if( arr[j] < arr[j-1]){
////                swap( arr,j-1,j);
////                }
////            }
////
////
////        }
////
////    }
//    public static void swap( int[] arr, int first, int second){
//
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//
//    }
//
//    public static void selectionSort( int[] arr){
//
//        for( int i = 0; i < arr.length; i++) {
//
//            int lastIndex = arr.length-1-i;
//            int max = max(arr,0,lastIndex);
//
//            swap(arr,max,lastIndex);
//        }
//
//        }
//
//        public static int max( int[] arr, int start,int end){
//
//            int maxIndex = start;
//
//            for( int i = start; i <= end; i++){
//                if( arr[i] > arr[maxIndex]){
//
//                    maxIndex = i;
//                }
//
//            }
//        return maxIndex;
//
//        }
//
//        public static void insertionSort( int[] arr){
//
//         for ( int i = 0; i < arr.length-1; i++){
//
//             for( int j = i+1; j >0; j--){
//
//                 if ( arr[j] < arr[j-1]){
//
//                     swap(arr,j,j-1);
//
//                 }else{ break; }
//
//             }
//
//
//         }
//
//
//        }
//
//        public static void cyclicSort( int[] arr){
//         int i = 0;
//          while( i < arr.length){
//
//              int correctIndex = arr[i] - 1;
//
//              if( arr[i] != arr[correctIndex]){
//
//                  swap(arr,i,correctIndex);
//
//              } else {
//
//                  i++;
//
//              }
//
//          }
//
//
//        }
//
//        public static void selectionSort2( int[] arr){
//
//          for( int i = 0; i < arr.length; i++){
//
//              int last = arr.length - 1 - i;
//              int max = max( arr,0,last );
//
//
//              swap(arr,last,max);
//          }
//
//
//
//        }
//    public static void insertionSort2( int[] arr){
//
//      for( int i = 0; i < arr.length-1; i++){
//
//          for( int j = i+1; j>0; j--){
//
//              if ( arr[j] < arr[j-1])
//
//          }
//
//
//      }
//
//
//
//
//
//    }
//
//    }
//

