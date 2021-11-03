public class _30 {

    public static void main(String[] args) {

        pattern(5);
    }

    public static void pattern( int n ){

        for (int i = 1; i <= n ; i++) {

            int spaces = n - i;
  // This code is for a single line
            for (int m = 1; m <= spaces ; m++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1;  j--) {
                System.out.print(j + " ");
            }
            for (int k = 2; k <= i ; k++) {
                System.out.print(k + " " );
            }
            System.out.println();

            }


        }

    }



