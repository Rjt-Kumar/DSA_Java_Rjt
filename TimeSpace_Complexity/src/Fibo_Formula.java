public class Fibo_Formula {

    public static void main(String[] args) {


            System.out.println(fiboFormula(234));
    }

   public static long fiboFormula(int n){

        return (long) ((Math.pow((1 + Math.sqrt(5))/2,n) - Math.pow((1 - Math.sqrt(5))/2,n))/Math.sqrt(5));

   }


}
