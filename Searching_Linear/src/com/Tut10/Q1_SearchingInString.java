package com.Tut10;

public class Q1_SearchingInString {

    public static void main(String[] args) {

        String name = "Ackerman";
        char search = 'r';
        System.out.println(searchString( name,search));

    }

    private static boolean searchString(String name, char search) {
        if( name.length() == 0) {    // In arr.length it doesnot have curly braces because here it is a variable
            return false;               // Where as in name.length it is a function
        }


       // Using for each loop

        for(char elm : name.toCharArray()){       // To use for each loop we need some array or collection
            if( elm == search){return true;};     // or something. Thats why we converted it into a char array.
        }


//        for(int i = 0 ;i < name.length() ; i++ ){
//
//            if(name.charAt(i) == search){return i;}
//
//        }

        return false;
    }
}
