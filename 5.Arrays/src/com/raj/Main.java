package com.raj;

public class Main {
    public static void main(String[] args) {
        /*
    syntac
    datatype[] variable_name = new datatypr[size];
    */

        //store 5 rollnumber:
        int[] rnos = new int[5];
        //or directly:
        int[] rnos2 = {12, 23, 34, 45, 56};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialization: actually here object is being created in the memory (heap)
//        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

//        for (String element : arr) {
//            System.out.println(element);
//        } //Enhanced "for loop"

    }
}
