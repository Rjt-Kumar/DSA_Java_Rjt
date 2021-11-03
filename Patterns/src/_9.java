public class _9 {

    public static void main(String[] args) {
        pattern(5);

    }

    public static void pattern( int n ){

        for (int i = 0; i < n ; i++) {

            int spaces = i;
            int stars = 2*(n-i) - 1;

            for (int j = 1; j <= spaces ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= stars ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
