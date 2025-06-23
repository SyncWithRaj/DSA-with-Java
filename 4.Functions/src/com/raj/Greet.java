package com.raj;

import java.util.Scanner;

public class Greet {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = in.nextLine();
        String personalised = myGreet(naam);
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String msg = "Hello " + name;
        return msg;
    }

    static String greet(){
        String greeting = "How are you?";
        return greeting;
    }
}
