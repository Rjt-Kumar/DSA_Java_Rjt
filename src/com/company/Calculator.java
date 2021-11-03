package com.company;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ans = 0;
        while ( true ){
            System.out.print("Enter an operator : ");
            char op = in.next().trim().charAt(0);
            if ( op == '+' || op == '-' || op == '*' || op == '%' || op == '/' ) {

                System.out.println("Enter two numbers : ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if ( op == '+'){
                    ans = num1 + num2;
                }
                if ( op == '-'){
                    ans = num1 - num2;
                }
                if ( op == '*'){
                    ans = num1 * num2;
                }
                if ( op == '/'){
                    ans = num1 / num2;
                }
                if ( op == '%'){
                    ans = num1 % num2;
                }

            }
            if ( op =='x' || op == 'X'){
                break;
            }
            System.out.println("The answer is : " + ans);
            }


        }



    }


