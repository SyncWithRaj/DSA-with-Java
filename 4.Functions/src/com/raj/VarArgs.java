package com.raj;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2, 3, 4, 5, 6, 7, 8, 34, 45, 40);
//        fun();
//        multiple(12, 23, "Raj", "Krunal");
//        multiple(12, "Raj", "Krunal");  //Gives an error you cannot skip "b"

        //Note:  fun(int a, int b, int ...v) Here "...v" is always comes at the end of argument bcz when we initialize at middle then how we know when "int b" is starting.

        demo(12, 23, 34);
        demo("Raj", "Brinda", "Ayush");
//        demo();  //Throws an error bcz we dont provide the data then function cant decide which function been run
    }

    static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }


    static void multiple(int a, int b, String... v) {

    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
