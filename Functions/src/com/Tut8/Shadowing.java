package com.Tut8;

public class Shadowing {
 //This will be shadowed at line 12
    static int x = 3;     // It is static because to use a varible inside a static function it need to be static
                      // We cannot use object dependent things in object independent things.

     //shodowing = having two variables within the same scope with the same name overlapping eachother

    public static void main(String[] args) {
        int x = 4;  //The class variable at line 5 is shadowed by this.
        //Scope will begin after the variable is declared
        System.out.println(x);
        we();
    }
   static  void we(){   //Shadowing does not work in methods.
      System.out.println(x);
  }
}
