package com.raj;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BD();
    }

    static void BD() {
        double x = 0.03;
        double y = 0.04;
//        double ans = y - x;
//        System.out.println(ans);

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal ans = Y.subtract(X);
//        System.out.println(ans);

        BigDecimal a = new BigDecimal("3870278042.827504984");
        BigDecimal b = new BigDecimal("6858735959.45353678695");


        // operations
        System.out.println(b.add(a));
        System.out.println(b.multiply(a));
        System.out.println(b.subtract(a));
        System.out.println(b.pow(2));
        System.out.println(b.negate());

        // constants
        BigDecimal constant1 = BigDecimal.ONE;
        BigDecimal constant2 = BigDecimal.TWO;
    }

    static void BI() {
        int a = 30;
        int b = 67;

        BigInteger B = BigInteger.valueOf(6);  // converting int/long to BigInteger
        int c = B.intValue();  // convert BI to int
        BigInteger C = new BigInteger("123456789023456789034567");
        BigInteger X = new BigInteger("73456787654456");

        // constants
        BigInteger D = BigInteger.TEN;

        // operations
        BigInteger s = C.add(X);
        BigInteger m = C.multiply(X);
        BigInteger sub = C.subtract(X);
        BigInteger d = C.divide(X);
        BigInteger rem = C.remainder(X);

        if (X.compareTo(C) < 0) {
            System.out.println("Yes");
        }
        System.out.println(Factorial.fact(10));
    }
}
