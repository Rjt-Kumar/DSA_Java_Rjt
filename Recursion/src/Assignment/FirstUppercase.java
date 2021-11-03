package Assignment;

public class FirstUppercase {

    public static void main(String[] args) {

        String s = "geekS";
        int n = s.length();
        System.out.println(firST(s,n));
    }

    public static char firST( String s , int n){

        if ( n == 1 ){

            return s.charAt(n);

        }

       if ( Character.isUpperCase(s.charAt(n)) ){

           return s.charAt(n);

        }
       else {

           return firST(s,n-1);

       }

    }

}
