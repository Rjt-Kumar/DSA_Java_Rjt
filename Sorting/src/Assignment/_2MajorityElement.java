package Assignment;

import java.util.Arrays;

public class _2MajorityElement {

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,3};

        System.out.println(containsDuplicate(arr));
    }
  static  public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        int maxCount = 1;

        for(int i=0; i < nums.length; i++){

            int count = 0;

            for(int j=0; j < nums.length; j++){

                if(nums[i] == nums[j]){
                    count++;
                }

            }

            if(count > maxCount){
                return true;
            }

        }

        return false;
    }


}
