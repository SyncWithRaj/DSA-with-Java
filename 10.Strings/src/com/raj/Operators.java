package com.raj;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // integer wil be converted to Integer that will call toString()

        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal" + 56);

        String ans = 56 + " " +  new ArrayList<>();
        System.out.println(ans); // operator + cannot be apply to integer and arraylist but if we add the string anywhere in the and then it will work and the data type is string

    }
}
