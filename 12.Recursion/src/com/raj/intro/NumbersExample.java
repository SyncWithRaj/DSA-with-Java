package com.raj.intro;

public class NumbersExample {
    public static void main(String[] args) {
        // print 1 2 3 4 5 numbers
        num1(1);
    }

    static void num1(int n) {
        System.out.println(n);
        num2(2);
    }

    static void num2(int n) {
        System.out.println(n);
        num3(3);
    }

    static void num3(int n) {
        System.out.println(n);
        num4(4);
    }

    static void num4(int n) {
        System.out.println(n);
        num5(5);
    }

    // function body here changes
    static void num5(int n) {
        System.out.println(n);
    }
}
