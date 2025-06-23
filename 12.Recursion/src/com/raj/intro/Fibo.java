package com.raj.intro;

public class Fibo {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21...............
//        int ans = fibo(5);
//        System.out.println(ans);

        for (int i = 0; i < 51; i++) {
            System.out.println(fiboFormula(i));
        }
    }

    static int fiboFormula(int n) {
        return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }

    static int fibo(int n) {
        // base condition
        if (n < 2) {
            return n;
        }

        // here this is not tail recursion bcs it calls fibo(n-1) and fibo(n-2) and add them and return them, so this extra step of addition and returning is not tail recursion
        return fibo(n - 1) + fibo(n - 2);
    }
}
