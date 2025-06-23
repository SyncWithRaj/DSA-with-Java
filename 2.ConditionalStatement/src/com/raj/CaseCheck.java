package com.raj;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        System.out.print("Enter: ");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.print("Lower Case: ");
        } else {
            System.out.print("Upper Case: ");
        }
        System.out.println(ch);
    }
}
