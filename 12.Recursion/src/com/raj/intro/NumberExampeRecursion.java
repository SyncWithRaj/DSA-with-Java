package com.raj.intro;

public class NumberExampeRecursion {
    public static void main(String[] args) {
        // print 1 2 3 4 5 numbers
        num(1);
    }

    static void num(int n) {

        if (n == 5) {
            System.out.println(n);
            return;
        }

        System.out.println(n);

        // recursive call
        // if you are calling a function again and again, you can treat it as a separate call in the stack

        // This is called tail recursion
        // this is the last function called
        num(n + 1);
    }
}
