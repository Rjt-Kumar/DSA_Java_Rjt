package Questions;

public class _2_SumOfNaturalNumbers {

    public static void main(String[] args) {

        System.out.println(sum(5,0,0));

    }

    public static int sum( int n , int sum, int i ){

        if ( i == n ){

            sum+= n;
            return sum;
        }

        sum += i;

        return  sum( n , sum , i+1);



    }

}
