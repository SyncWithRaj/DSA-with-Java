package com.raj;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
//        System.out.println("Choose: Apple, Banana, Grapes, Mango");
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();

//        if (fruit.equals("mango")){
//            System.out.println("King of fruits");
//        }
//
//        if (fruit.equals("apple")){
//            System.out.println("A sweet red Fruit");
//        }


//        switch (fruit) {
//            case "Mango":
//                System.out.println("King of Fruits");
//                break;
//
//            case "Apple":
//                System.out.println("A red Fruit");
//                break;
//
//            case "Banana":
//                System.out.println("A yellow Fruit");
//                break;
//
//            case "Grapes":
//                System.out.println("A Small Fruit");
//                break;
//
//            default:
//                System.out.println("Enter valid Fruits");
//        }


/* This is same as above but in short you can use both*/
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of Fruits");
//            case "Apple" -> System.out.println("A red Fruit");
//            case "Banana" -> System.out.println("A yellow Fruit");
//            case "Grapes" -> System.out.println("A Small Fruit");
//            default -> System.out.println("Enter valid Fruits");

        int day = in.nextInt();

//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }


        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Enter valid number from 1-7");
        }


//        switch (day) {         //Same as above
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
//            case 6, 7 -> System.out.println("Weekend");
//            default -> System.out.println("Enter valid number from 1-7");
//        }

    }
}
