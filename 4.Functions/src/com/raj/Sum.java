package com.raj;

import java.util.Scanner;

public class Sum {
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = in.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = in.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = in.nextInt();
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int ans = sum3(12, 21);
        System.out.println(ans);
    }

}
