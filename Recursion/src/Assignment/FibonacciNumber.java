package Assignment;

public class FibonacciNumber {

    public static void main(String[] args) {

        System.out.println(fib(8));

    }

    public static int fib( int n ){

        if ( n < 2 ) {

            return n;

        }

        else {    return fib(n-1)+ fib ( n-2) ; }
        }


    }



