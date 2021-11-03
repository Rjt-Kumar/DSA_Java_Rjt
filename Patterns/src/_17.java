import com.sun.security.jgss.GSSUtil;

public class _17 {

    public static void main(String[] args) {

        pattern(50);

    }

    public static void pattern( int n ){

        for (int i = 1; i <= 2 * n - 1 ; i++) {

            if ( i <= n ){

                int spaces = n - i;

                for (int s = 1; s <= spaces ; s++) {
                    System.out.print(" ");
                }

                for (int j = i; j >= 1 ; j--) {
                    System.out.print(j);
                }

                for (int k = 2; k <= i ; k++) {
                    System.out.print(k);
                }

                System.out.println();

            }

            else {

                int spaces = i - n;

                for (int s = 1; s <= spaces ; s++) {
                    System.out.print(" ");
                }

                for (int j = n - ( i - n ) ; j >= 1 ; j--) {
                    System.out.print(j);
                }

                for (int k = 2; k <= n - ( i - n ) ; k++) {
                    System.out.print(k);
                }

                System.out.println();



            }
            }
        }




    }


