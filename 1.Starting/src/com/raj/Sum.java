package com.raj;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 1st Number: ");
        float a = input.nextFloat();
        System.out.print("Enter your 2nd Number: ");
        float b = input.nextFloat();

        float sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
