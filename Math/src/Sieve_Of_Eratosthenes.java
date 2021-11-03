public class Sieve_Of_Eratosthenes {

    public static void main(String[] args) {

        int n = 40;

        remove_multiples(n);

    }

    private static void remove_multiples(int n) {

        boolean[] primes = new boolean[n+1];

        for( int i = 2; i*i <= n ; i++){

            if(!primes[i]){ // it means that if primes[i] == false then do this.

                for( int j = i*2; j <= n ; j+=i){

                    primes[j] = true;

                }


            }


        }

        for (int m = 2; m <= n ; m++) {

            if( primes[m] == false){

                System.out.println(m);

            }

        }






            }

        }





