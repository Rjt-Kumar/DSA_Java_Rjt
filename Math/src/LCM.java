public class LCM {

    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int d = gcd(a,b);

        System.out.println(lcm(a,b,d));
    }

    static int lcm(int a , int b ,int d){

        int f = a/d;
        int g = b/d;

        return f*g*d;
        /*
        or directly return (a*b)/gcd(a ,b) i.e. d;
         */

    }
    static int gcd( int a , int b){

        if(a==0){
            return b;

        }

        return gcd(b%a,a);
    }

}
