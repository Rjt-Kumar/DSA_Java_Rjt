import java.util.HashMap;

public class CountDistinctElementInWindow {

    public static void main(String[] args) {

        int[] arr = {1,2,2,1,3,1,1,12,4,5,3};
        int k = 3;
        // Now we will apply sliding window technique

        int left = 0;
        int right = k-1;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < k ; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],0);
            }
            map.put(arr[i],map.get(arr[i])+1);
        }
        System.out.println(map.size());
        // Going to next window
        right++;
        while( right < arr.length){


            if( map.get(arr[left]) == 1){
                map.remove(arr[left]);
            }else{
                map.put(arr[left],map.get(arr[left])-1);
            }

            left++;

            if( map.containsKey(arr[right])){
                map.put(arr[right],map.get(arr[right])+1);
            }else{
                map.put(arr[right],1);
            }
            System.out.println(map.size());
            right++;


        }
    }
}
