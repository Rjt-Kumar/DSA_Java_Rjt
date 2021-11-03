public class _5 {

    public static void main(String[] args) {
        pattern(5);

    }

    public static void pattern( int n ){

        for (int i = 1; i <= 2*n - 1 ; i++) {

           int NoOfCol = ( i <= n ? i : n - i%n );

           for ( int j = 1; j <= NoOfCol; j++){

               System.out.print("*");

           }
            System.out.println();
            }
        }


    }



