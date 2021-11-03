public class _28 {

    public static void main(String[] args) {
        pattern(5);

    }

    public static void pattern( int n ){

        for (int i = 1; i <= 2*n - 1 ; i++) {

            if ( i <= n ){

                int spaces = n - i;
                int stars = i;

                for (int j = 1; j <= spaces ; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= stars ; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            else {

                int spaces = i - n;
                int stars = n - ( i - n );

                for (int j = 1; j <= spaces ; j++) {
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
