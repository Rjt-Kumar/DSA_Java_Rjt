package Level_Easy;

public class Print1toN {

    public static void main(String[] args) {
        int n = 4;
        numbers(n);
    }

    public static void numbers(int n){

        if ( n == 0 ){ return ; }

        numbers(n-1);
        System.out.println(n);


    }
}
