import java.util.Arrays;

public class RecursionPractice {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        triangle(arr);

    }

    public static void triangle(int[] arr){

        if(arr.length==0){ return; }

        int[] ans = new int[arr.length-1];

        for (int i = 0; i < arr.length - 1; i++) {

            ans[i] = arr[i] + arr[i+1];

        }
        System.out.println(Arrays.toString(arr));
        triangle(ans);


    }

}
