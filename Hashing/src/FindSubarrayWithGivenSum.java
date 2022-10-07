import java.util.*;
import java.util.HashMap;

public class FindSubarrayWithGivenSum {

    public static void main(String[] args) {
        int[] arr= {1,2,35,3,3,4,3,4};
        // find the starting and ending index of the subarray with sum = 41
        int sum = 41;

        // we will use currSum = sum + k
        // now we need to search for this k in the hashMap

        HashMap<Integer,Integer> map = new HashMap<>();

        // First add prefix sum as key and index as value in the hashMap
        int currSum1 = 0;
        for(int i = 0; i < arr.length; i++){
            currSum1 += arr[i];
            map.put(currSum1,i);
        }


        int currSum = 0;
        int start = 0 ;
        int end = arr.length;
        int minLength = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length;i++){

            currSum += arr[i];

            // when our first subarray is the subbarray with given sum
            if(currSum == sum){
                start = 0;
                end = i;
            }else if( map.containsKey(currSum-sum)) {
                start = map.get(currSum - sum) + 1;   // cause suppose  7 3 6 5 8 and if sum = 9
                end = i;                           // then   3 6 will be the subarray but the currSum-sum
                                              // will be 7 and index of 7 is 0 hence +1
            }

            if( minLength > (end-start)+1 ){
                minLength = end-start+1;
            }
        }

        System.out.println("The starting and ending index of subbarray is " + start + end);
        System.out.println("The minimum length of the subarray with given sum is "+ minLength);

        // If you want to find the subarray wiht minium sum then take a global variable as minLength

    }
}
