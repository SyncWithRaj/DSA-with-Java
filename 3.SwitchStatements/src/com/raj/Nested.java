package com.raj;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {

        /*   Alt + Enter se formate change kar sakte ho   */

        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Raj Ribadiya");
            case 2 -> System.out.println("Rahul Fakir");
            case 3 -> {
                System.out.println("Employee Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department found");
                }
            }
            default -> System.out.println("Enter valid ID");
        }
    }
}
