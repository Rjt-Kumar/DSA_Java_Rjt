package AllPermutationAndCombinations;

public class EverySingleAnswer {

    public static void main(String[] args){

        // here the answer will be like for the dice sum problem
        /* 11112
11121
1113
11211
1122
1131
114
12111
1212
1221
123
1311
132
141
15
21111
2112
2121
213        Here you can find every single answer with repeated letters all having different permutation
2211
222        Now if you want to have
231
24
3111
312
321
33
411
42
51
6
*/
        dice("",6);
    }

    public static void dice(String ans,int target){

        if( target == 0){
            System.out.println(ans);
            return;
        }


        for( int i = 1; i <= 6 && i <= target;i++){
            dice(ans+i,target-i);
        }




    }
}
