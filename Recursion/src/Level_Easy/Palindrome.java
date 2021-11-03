package Level_Easy;

public class Palindrome {

    public static void main(String[] args) {

        palindrome( 111,0);

    }

    public static void palindrome(int n , int ans){

        if ( n == 0){
            System.out.println(ans);
            return;
        }
        int remainder = n % 10;
        ans += (remainder*remainder*remainder);

        palindrome(n/10,ans);

    }
}
