package com.raj;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(67);
//        list.add(2334);
//        list.add(654);
//        list.add(8673);
//        list.add(45);
//        list.add(707);

//        System.out.println(list.contains(654));
//        System.out.println(list);
//        list.set(1, 99);
//        list.remove(4);
//        System.out.println(list);
        
        //input 
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here. list[index] syntax will not work here
        }

        System.out.println(list);
    }
}