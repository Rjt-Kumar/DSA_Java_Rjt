public class _31 {

    public static void main(String[] args) {
        pattern(9);
    }

    public static void pattern( int n ){

        for (int i = 0; i <= 2*n  ; i++) {

            for (int j = 0; j <= 2*n; j++) {

                int atEveryIndex = Math.min(Math.min(j,i),Math.min(2*n-i,2*n-j));

                System.out.print(atEveryIndex +" ");

            }
            System.out.println();

        }

        
    }
}
