package com.Tut7;

import java.util.Scanner;

public class WeekendsAndWeekdays {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        byte day = in.nextByte();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays.");
            case 6, 7 -> System.out.println("Weekand.");
            default -> System.out.println("Enter a valid day.");
        }


    }


}
