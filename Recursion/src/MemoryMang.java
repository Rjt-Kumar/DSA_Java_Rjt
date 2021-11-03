import com.sun.security.jgss.GSSUtil;

public class MemoryMang {
 /*
        How function calls works in languages ?

        * when ever the function is called it goes into the stack memory
        * while the function is not finished executing it will remain in the stack memory
        * once the function is finished the function will be removed from the stack memory and the flow of the program
          will go to where the function was called.

        Recursion : a function that calls itself

        Why recursion ?

        * it helps us in solving bigger complex problems in simpler way.
        * you can convert recursion solutions into iteration ( converting into loops and for loops // in future ) and vise versa
          and then optimize it into iteration.
        * space complexity is not constant since each recursive call takes memory // since loops doesn't take any memory that is why they are more optimize
        * it helps us in breaking bigger problem into smaller problem.

  */
      public static void main(String[] args) {
     print(1);
      }

      public static void print( int n ){

          if ( n == 5 ) {    // Base condition
                             // If there is no base condition in this function then it will call itself again and again
              System.out.println(n); // each time it will call itself will take different memory in stack
              return;  // at one time it will exceed your memory and an error will occur known as stackoverflow error.
          }

          System.out.println(n); // the same function with different call value will be treated as different cell in stack
           // Tail recursion
          print(n + 1);   // Recursive call

          }

      }


