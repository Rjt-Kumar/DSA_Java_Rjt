package com.CyclicSort;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2_FindAllTheDisappeardNumber {

    public static void main(String[] args) {

        // In this question the number of disappearing elements can be 1 , 2 or any number that's why instead of
        // returning a number or an array, we return a list because list can of any size.

        int[] arr = {4,2,2,2,5};  // Elements in the Array are from 1 to N
        System.out.println(Disappearing(arr));
    }

    public static List<Integer> Disappearing(int[] arr){

        List<Integer> answer = new ArrayList<>();

        //  First we will sort the array.

        int i = 0;

        while ( i < arr.length ){

            int correctIndex = arr[i] - 1; // Because elements in this question are from 1 to N if they were form 0 to N
                                           // Then the correct index would be equal to arr[i] i.e. the element.
            if ( arr[i] != arr[correctIndex] ){

                swap(arr,i,correctIndex);

            }else {
                i++;
            }

        }  //  while loop over
        for (int index = 0 ; index < arr.length ; index++){

            if (arr[index] != index+1){

                answer.add(index+1);

            }

        }// for loop over
         return answer;

        }


    public  static void swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }


    }



