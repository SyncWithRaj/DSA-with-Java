package com.raj.easy;

public class Fact {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }

    static int fact(int n) {
        if (n < 0) {
            System.out.println("Factorial of negative number is not possible");
        }

        if (n == 1 || n == 0) {
            return 1;
        }

        return n * fact(n - 1);
    }
}
