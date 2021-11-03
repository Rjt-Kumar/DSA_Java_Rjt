public class Intro {
 /*
    String = a collection of characters
    everything that starts with a capital letter is a class. String is class of java.

    String  a = 'kunal';
    String b = 'kunal';

    string pool = it just a separate memory structure inside the heap memory.
    All the similar values of string are not recreated in the pool. Since kunal already exist in the pool just point b
    towards kunal.It makes our code more optimized

    Strings are immutable because of security reason.

    Comparison of strings :

    1 : == method ( it gives true if the both the reference variable are pointing towards same object )
           Creating new object having same value using new keyword

    2 : .equals() is a method to compare the value of two different objects

    Some more methods in strings

    charAt() = to get a character at any index we use charAt()

  */
 public static void main(String[] args) {
      String name = new String("Kunal");
      String name2 = new String( "Kunal");
     System.out.println(name == name2); // false because both the variable point towards different object which are
     System.out.println(name.equals(name2));// outside the string pool but in heap memeory
 }



}
