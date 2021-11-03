public class Q_2_BinarySearch {

    public static void main(String[] args) {

        int[] arr = { 1,2,3,4,5,6,7,8,9};
         int ans = search( arr, 8,0,arr.length - 1);
        System.out.println(ans);
    }

    public static int search( int[] arr, int target , int start , int end ){

        if( start > end ){

            return -1;

        }

        int middle = start + ( end - start )/2;

        if ( arr[middle] > target ){

            end = middle - 1;
            return search(arr, target, start , end );

        }

        else if ( arr[middle] < target ){

            start = middle + 1;
          return  search(arr, target , start, end );
        }


        return middle;
    }
}
