package com.raj;

public class Swap {

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void changeName(String naam){
        naam = "Panthi Ahir"; //Creating a new object
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);

        System.out.println(a + " " + b);

        String name = "Raj Ribadiya";
        changeName(name);
        System.out.println(name);
    }
}
