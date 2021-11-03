package com.Tut7;

import java.util.Scanner;

public class Fruit {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("It is the king of the fruits.");
            case "Apple" -> System.out.println("It is from kashmir.");  // break is already added in advanced switch syntax
            case "Banana" -> System.out.println("Wana take it.");    // More cleaner
            default -> System.out.println("Enter a valid fruit.");
        }


    }

}
