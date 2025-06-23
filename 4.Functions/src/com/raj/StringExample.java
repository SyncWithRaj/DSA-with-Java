package com.raj;

public class StringExample {

    static  String greet(){
        String greeting = "How are you?";
        return greeting;
    }
    public static void main(String[] args) {
        String msg = greet();
        System.out.println(msg);
    }
}