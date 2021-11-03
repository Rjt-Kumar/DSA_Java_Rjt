package com.Tut10;

public class Aboutsearching {

       // Linear search = start searching from the first element till you find the element you are looking for.

        //  Searching in array using linear search and returning the index

    public static void main(String[] args) {

        int[] arr = {1,2,4,5,6,7,8};
        int number = 5;

        int ans = linearsearch(arr, number);
        System.out.println(ans);

    }

     static int linearsearch(int[] arr, int number) {

        if(arr.length == 0){

            return -1;

        }
         //Whole loop while run till the element is found
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == number){
                return i;
            }
        }

        return -1;

    }


}

