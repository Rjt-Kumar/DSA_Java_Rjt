package com.company;



import javax.swing.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Main {

    public static void main(String[] args){
     /*  String message = "Hello World" + "!!";
        System.out.println(message);
        System.out.println(message.indexOf("w"));
        System.out.println(message.toUpperCase());
        System.out.println(message.replace("H","F"));
        System.out.println(message.trim());
        System.out.println(message.length( ));
        int[][] numbers = { {1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(numbers));
        float x = 2.33F;
        double y = x + 23;
       System.out.println(y);
       // String message = "1234";
       // int f = Integer.parseInt(message) + 23;
        System.out.println(f);
        double number = Math.ceil(1.1);
        System.out.println(number);*/
    //     //String result = NumberFormat.getPercentInstance().format(.35);
    //.out.println(result);
    //your age : ");
    //er(System.in);
    //();
    // age is 1221" + age);


     // String x = "1f";
     // int y = Integer.parseInt(x) + 4 ;
     //   System.out.println(y);
       // System.out.println(  NumberFormat.getPercentInstance().format(1234353.324));
      // Scanner scanner = new Scanner(System.in);
      // byte age = scanner.nextByte();
      //  System.out.println(age);

                            //  MORTGAGE CALCULATOR BY ME

            //Scanner scanner = new Scanner(System.in);
            //
            // System.out.print("Principal : ");
            //         int  Principal = scanner.nextInt();
            //
            // System.out.print("Annual Interest Rate : ");
            //         float AnnualIr = scanner.nextFloat();
            //         System.out.print("Period (Years) : ");
            //  float period = scanner.nextFloat();
            //  float r = AnnualIr/1200F;
            //  float n = period*12F;
            //  double x = Math.pow(1+r,n);
            //  double mortgage = Principal * ((r*(x)/(x-1)));
            // System.out.print("Mortgage : " + NumberFormat.getCurrencyInstance().format(mortgage));


                          //  MORTGAGE CALCULATOR BY MOSH


          //   final byte MONTHS_IN_YEAR = 12;
          //   final byte PERCENT = 100;

          //   Scanner scanner = new Scanner(System.in);

          //   System.out.print("Principal : ");
          //   int principal = scanner.nextInt();

          //   System.out.print("Annul interest : ");
          //   float annualInterest  = scanner.nextFloat();
          //   Float monthlyInterest = annualInterest/MONTHS_IN_YEAR/PERCENT;

          //   System.out.print("Period (Years) : ");
          //   byte years = scanner.nextByte();
          //   int noOfPayments = years * MONTHS_IN_YEAR;

          //   double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest,noOfPayments)/(Math.pow(1+monthlyInterest,noOfPayments)-1) );

          //   String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
          //   System.out.println("Mortgage : " + formattedMortgage);


                                // TERNARY OPERATOR

         // int income = 120_000;
         // String  classname = (income > 100_000) ? "First" : "Economy";
         // System.out.println(classname);


                             //SWITCH CASE
     // String role = "Boss";
     // switch (role) {

     //     case "Admin" :
     //         System.out.println("You are Admin.");
     //         break;

     //     case "Moderator" :
     //         System.out.println("You are Moderator.");
     //         break;

     //     default :
     //         System.out.println("Your are the BOSS.");
     //         break;

     // }

       // Scanner scanner = new Scanner(System.in);
       // int number = scanner.nextInt();

       // switch (number) {

       //     case 1:
       //         System.out.println("Your are number 1.");
       //         break;

       //     case 2:
       //         System.out.println("Your are number 2.");
       //         break;

       //     default :
       //         System.out.println("Fuck you Bitch.");
       //         break;


       // }

                                   //FIZZ BUZZ


      //  Scanner scanner = new Scanner(System.in);
      //  byte number = scanner.nextByte();

      //  if (number % 3 == 0 && number % 5 == 0)
      //      System.out.println("FizzBUzz");

      //  else if (number % 3 == 0)
      //      System.out.println("Buzz");

      //  else if (number % 5 == 0)
      //      System.out.println("Fuzz");

      //  else
      //      System.out.println(number);


                          // WHILE LOOPS


    //   String input = "";
    //   Scanner scanner = new Scanner(System.in);

    //   while (!input.equals("quit")) {
    //       System.out.print("Input : ");
    //       input = scanner.next().toLowerCase();
    //
    //       System.out.println(input);

    //   }

                                //  FOR EACH LOOPS

       // String[] fruits = { "Apple", "Mango", "Orange"};
//
       // for (String fruit : fruits)
       //      System.out.println(fruit);


      // int[] numbers = {1,4,3,6,2};
      // Arrays.sort(numbers);
      // System.out.println(Arrays.toString(numbers));
      // for (byte number : numbers )
      //     System.out.println(number);


                                 //  MORTGAGE CALCULATOR  BY ME

        final byte  MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal ($1K - $1M) : ");
        int principal = scanner.nextInt();

        while ( !(principal >= 1000 && principal <= 1000000) ) {
            System.out.println("Enter a number between 1,000 and 1,000,000.");
            System.out.print("Principal ($1K - $1M) : ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1000000)
                break;
        }
        System.out.print("Annual Interest Rate : ");
        float annualInterestRate = scanner.nextFloat();
        while ( !(annualInterestRate > 0 && annualInterestRate <= 30) ) {
            System.out.println("Enter a value greater than 0 and less than equal to 30.");
            System.out.print("Annual Interest Rate : ");
            annualInterestRate = scanner.nextFloat();
            if (annualInterestRate > 0 && annualInterestRate <= 30)
                break;
        }

        float monthlyInterestRate = annualInterestRate/MONTH_IN_YEAR/PERCENT;

        System.out.print("Period (Years) : ");
        byte period = scanner.nextByte();
        while ( !(period > 0 && period <= 30) ) {
            System.out.println("Enter a value greater than 0 and less than equal to 30.");
            System.out.print("Period (Years) : ");
            period = scanner.nextByte();
            if (period > 0 && period <= 30)
                break;
        }

        int  noOfPayments = period * MONTH_IN_YEAR;

        double mortgage = principal * (monthlyInterestRate * (Math.pow(1+monthlyInterestRate,noOfPayments))/(Math.pow(1+monthlyInterestRate,noOfPayments) - 1));

        System.out.print("Mortgage : " + NumberFormat.getCurrencyInstance().format(mortgage));












    }
}
