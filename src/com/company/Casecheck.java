package com.company;

import java.util.Scanner;

public class Casecheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char letter = input.next().trim().charAt(0);
        if ('a' <= letter && letter <= 'z' ){
            System.out.println("Lower case Alphabet");
        } else {
            System.out.println("Upper case Alphabet");
        }




    }

}
