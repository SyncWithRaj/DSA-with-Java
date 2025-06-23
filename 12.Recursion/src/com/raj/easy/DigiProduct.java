package com.raj.easy;

public class DigiProduct {
    public static void main(String[] args) {
        int ans = pro(55);
        System.out.println(ans);
    }

    static int pro(int n) {
        if (n % 10 == n) {
            return n;
        }

        return (n % 10) * pro(n / 10);
    }
}
