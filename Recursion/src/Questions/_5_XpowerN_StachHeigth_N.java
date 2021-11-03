package Questions;

public class _5_XpowerN_StachHeigth_N {

    public static void main(String[] args) {

        int x = 2;
        int n = 4;

        int ans = power( x , n );
        System.out.println(ans);

    }
    public static int power( int x , int n){

       if ( n == 0 ){

           return 1;          // here the stack height is approx n. To get the answer of the question
       }

       if ( x == 0 ){

           return 0;

       }

       return x*power( x , n-1);

    }

}
