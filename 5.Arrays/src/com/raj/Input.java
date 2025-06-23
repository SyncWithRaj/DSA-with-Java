package com.raj;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 33;
        arr[2] = 43;
        arr[3] = 53;
        arr[4] = 63;
        //[23,33,43,53,63]
//        System.out.println(arr[3]);

        //input using for loops

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

        
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }

//        for (int j : arr) { // for every elements in the array, print the element "loop known as foreach loops"
//            System.out.print(j + " "); // here "j" represents element of the array
//        }

//        System.out.println(Arrays.toString(arr));


        //array of object
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        str[1] = "Raj";

        System.out.println(Arrays.toString(str));

    }
}
