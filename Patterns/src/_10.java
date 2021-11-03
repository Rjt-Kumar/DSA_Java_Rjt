public class _10 {

    public static void main(String[] args) {
        pattern(5);

    }

    public static void pattern( int n ){

        for (int i = 1; i <= n ; i++) {

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

    }

}
