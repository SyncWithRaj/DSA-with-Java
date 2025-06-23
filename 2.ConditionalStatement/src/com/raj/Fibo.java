package com.raj;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        System.out.print("Enter number of terms in Fibonacci Series: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.print("0 ");
        System.out.print("1 ");
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            System.out.print(b + " ");
            count++;
        }

    }
}
