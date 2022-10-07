package AllPermutationAndCombinations;

public class NoDifferentPermu_ComninationSum {

    public static void main(String[] args) {

        sum(new int[] {1,2,3,4,5,6},4,new String(""),0);

    }

    public static void sum(int[] arr,int target , String ans,int n){

        if( target == 0 ){
            System.out.println(ans);
            return;
        }

        for( int i = n; i < arr.length && arr[i] <= target;i++){

            sum(arr,target-arr[i],ans+arr[i],i);


        }



    }
}
