package Questions;

public class _4_PrintingFib {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(0);
        System.out.println(1);
        int n = 7;
        fib(n-2, a , b); // here we have passed n - 2 because we have printed the first two terms above

    }

    public static void fib( int n, int a , int b ){

        if ( n == 0 ){

            return;

        }
          int c = a + b;

         // a = b;
         // b = c;

          fib( n - 1, b,c); // it also means that a = b and  b = c for the upcoming element
          System.out.println(c);

        }


    }

