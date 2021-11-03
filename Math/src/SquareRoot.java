public class SquareRoot {

    public static void main(String[] args) {

        int n = 40;
        int precision = 3;

        System.out.println(squareRoot(n,precision));


    }

    private static double squareRoot(int n,int p) {
        double root = 0;
        int start = 0;
        int end = n;

        while ( start <= end ){

            int middle = start + ( end - start)/2;

            if(middle*middle == n){
               return middle;

            }
            else if( middle * middle < n){

                start = middle + 1;
                root = middle;

            }
            else { // middle * middle > n therefore we set root = middle - 1
                root = middle -1;
                end = middle -1;
            }
        }// while loop over
        double inc = 0.1;
        for (int i = 1; i <= p ; i++) {

            while(root*root < n){

                root+=inc;            // adding precision value to the root.


            }
            root-=inc;
            inc = inc/10;
        }
             return root;
    }
}

