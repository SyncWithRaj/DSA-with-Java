package com.raj;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int a = in.nextInt();
        System.out.print("Enter 2st Number: ");
        int b = in.nextInt();
        System.out.print("Enter 3st Number: ");
        int c = in.nextInt();

//        ---1st---
//        if (a > b) {
//            if (a > c) {
//                System.out.println(a + " is Largest Number");
//            } else {
//                System.out.println(c + " is Largest Number");
//            }
//        } else {
//            if (b > c) {
//                System.out.println(b + " is Largest Number");
//            } else {
//                System.out.println(c + " is Largest Number");
//            }
//        }

//        ---2nd---
//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }

//        ---3rd---
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}
