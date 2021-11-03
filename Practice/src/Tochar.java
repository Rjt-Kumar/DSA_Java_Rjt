public class Tochar {

    public static void main(String[] args) {



        int ans = factorial(3, 0);
        System.out.println(ans);

    }
    public static int factorial(int n , int ans  ){

         if( n == 0 ){


             return ans;

         }

          ans = ans+n;

          return  factorial(n-1, ans );


       }


    }

