package com.raj;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt(); // Throws error
//        System.out.println(num);

        // Type Casting
//        int num = (int)(67.56f);
//        System.out.println(num);


        //Automatic type promotion in expression
//        int a = 257;
//        byte b = (byte)(a);  // 257 % 256 = 1 "as output"
//        System.out.println(b);


//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) / c;
//        System.out.println(d);


//        byte b = ;20;
//        b = b * 2 //Shows error because b*2 is promoted to int by compiler and int cant be stored in byte...
//        System.out.println(b);

//        int number = 'A';
//        System.out.println(number);

//        System.out.println(3 * 5.6);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double res = (f * b) + (i / c) - (d - s);
        //float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(res);

    }


}
