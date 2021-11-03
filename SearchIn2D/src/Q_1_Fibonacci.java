public class Q_1_Fibonacci {

    public static void main(String[] args) {

        System.out.println(fib(49));

    }

    public static int fib( int n ){

          if ( n < 2 ){    // base condition

          return n;

     }

          return fib( n - 1 ) + fib( n - 2);  // recursive relation

    }
}
