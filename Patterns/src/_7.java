public class _7 {

    public static void main(String[] args) {
        pattern(5);

    }
public static void pattern( int n){

    for (int i = 1; i <= n ; i++) {

        int NoOfSpaces = i;
        int NoOfStars = n - i;

        for (int j = 1; j <= NoOfSpaces ; j++) {
            System.out.print(" ");
        }
        for (int k = 1;k <= NoOfStars ; k++) {
            System.out.print("*");
        }
        System.out.println();

    }

}


}
