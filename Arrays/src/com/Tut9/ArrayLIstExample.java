package com.Tut9;

import java.util.ArrayList;

public class ArrayLIstExample {
         // WHY DO WE NEED AN ARRAYLIST
 //   Array has a fixed size but what if we dont know what is the required size
 //   then we use array list.
 //   It is a part of collection framework.
    public static void main(String[] args) {

      ArrayList<Integer> list = new ArrayList<>(10);

      //Here list is a reference variable and a new object is being created.
      // This integer that is added over here is not a primitive it is a wrapper class.
        list.add(447);
        list.add(4575437);
        list.add(4745);
        list.add(435);
        list.add(4);
        list.add(4537);

        list.get(2);  // To get an item at any index.

        list.remove(3);
        list.set(2,5343);  // Here first value that we have added is the index and the second value that we have added is the value that we want to store in that index


        System.out.println(list);    //Array list is directly print

        System.out.println( list.contains(2342)); //It tells us whether the list contains 2342 or not and returns a boolean value.


          //How it can have an infinite size

      // 1 :  Size is actually fixed internally
      // 2 :  Say array fills by some amount
  /*       It will create an array of double  or size increases the size
           old elements are copied in the new one
           and the old one is deleted.    */
    }

}
