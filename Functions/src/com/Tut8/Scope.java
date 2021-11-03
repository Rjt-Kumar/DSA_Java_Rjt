package com.Tut8;

public class Scope {
    public static void main(String[] args) {

         //Scope = where a variable can be accessed is called it's scope.
    /*    functional scope
          a variable initialised in a function can only be accessed inside that function

        block scope
                if a function is initialised. It can not be initialised again in the same scope
                but we can change the value  */

       // Anything initialised outside the block can be used or changed inside the block
       // and anything initialised inside the block cannot be accessed out side the block
        String name = "Levi";
        {
            name = "Eren";
        }

        System.out.println(name);
    }
}
