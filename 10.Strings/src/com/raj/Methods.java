package com.raj;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Raj Pravinkumar Ribadiya";
        System.out.println(Arrays.toString(name.toCharArray()));  // convert in array of strings
        System.out.println(name.toLowerCase());   // convert to lowercase
        System.out.println(name);  // origional string cannot change
        System.out.println(name.indexOf('a')); // give index of an element
        System.out.println("     Raj     ".strip());  // remove spaces
        System.out.println(Arrays.toString(name.split(" "))); // make arrays of single string
    }
}
