package com.raj;

import java.util.Scanner;

public class Calcuator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take input from user till user does not press X or x
        int ans = 0;

        while (true) {
            //Take the operator as input
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter 1st Number: ");
                int a = in.nextInt();
                System.out.print("Enter 2nd Number: ");
                int b = in.nextInt();

                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    if (b == 0) {
                        System.out.println("Denominator can't be Zero");
                    } else {
                        ans = a / b;
                    }
                }
                if (op == '%') {
                    ans = a % b;
                }
            } else if (op == 'X' || op == 'x') {
                break;
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.print("Ans is: ");
            System.out.println(ans);
        }

    }
}
