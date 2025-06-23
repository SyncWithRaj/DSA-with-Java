package com.raj.easy;

public class Sum {
    public static void main(String[] args) {
        int ans = sum(5);
        System.out.println(ans);
    }

    static int sum(int n) {
        if (n == 1) {
            return 1; // base condition kyunki agar ye nhi lagaya toh sum rukega hi nhi to error aayega
        }
        return n + sum(n - 1);
    }
}
