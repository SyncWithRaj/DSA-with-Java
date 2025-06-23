package com.raj;

public class Comparison {
    public static void main(String[] args) {
        String a = "Raj";
        String b = "Raj";
        String c = a;

//        System.out.println(c == a);
//        System.out.println(a == b);

        String name1 = new String("Raj");
        String name2 = new String("Raj");

//        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
    }
}
