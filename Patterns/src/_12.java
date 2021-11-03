public class _12 {

    public static void main(String[] args) {
        pattern(5);

    }

    public static void pattern( int n ){

        for (int i = 1; i <= 2*n ; i++) {

            if ( i <= n ){

                int spaces = i - 1;
                int stars = n - i + 1;

                for ( int j = 1; j <= spaces ; j++){
                    System.out.print(" ");
                }
                for (int k = 1; k <= stars ; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            else {

                int spaces = n - ( i - n );
                int stars = i - n;

                for ( int j = 1; j <= spaces ; j++){
                    System.out.print(" ");
                }
                for (int k = 1; k <= stars ; k++) {
                    System.out.print("* ");
                }
                System.out.println();

            }


        }

    }
}
