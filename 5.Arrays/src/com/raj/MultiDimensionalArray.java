package com.raj;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][]; //int[rows][columns] number of rows are mandatory to define.you can add number of columns but it is not mandatory.

//        int[][] arr = {
//                {1, 2, 3}, // 0th index
//                {4, 5}, //1st index
//                {6, 7, 8, 9} //2nd index -> arr2d[2]
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length); //No. of rows

        //input
        for (int row = 0; row < arr.length; row++) {
            //For each col on every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        //output
//        for (int row = 0; row < arr.length; row++) {
//            //For each col on every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        //output
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        System.out.println();

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}
