public class Prime {

    public static void main(String[] args) {
        int n = 40;
        for(int i = 1; i <= 40; i++){

            if(prime(i)){
                System.out.println(i);
            }

        }

    }

    public static boolean prime(int n){

        if( n == 1 ){  return false;}
        int a = 2;
        while( a*a <= n){

            if( n % a == 0 ){ return false;}

            else {a++;}
        }
        return true;
    }
}
