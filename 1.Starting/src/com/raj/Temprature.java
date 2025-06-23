package com.raj;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter temp in Celcius: ");
        float c = in.nextFloat();

        float f = (9.0f / 5.0f) * c + 32;
        System.out.println(f);
    }
}
