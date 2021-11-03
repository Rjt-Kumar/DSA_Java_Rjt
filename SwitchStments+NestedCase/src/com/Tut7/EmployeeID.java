package com.Tut7;

import java.util.Scanner;

public class EmployeeID {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("You are from IT department.");
            case 2 -> {
                System.out.println("Your department is ");
                switch (department) {
                    case "computer science" -> System.out.println("Highest package");
                    case " management " -> System.out.println("You are from Mangement");
                    default -> System.out.println("No such departmebt is not available in our collage.");
                }
            }
            case 3 -> System.out.println("your are from studying.");
            default -> System.out.println("Choose among 1 and 2 only ");
        }

    }

}
