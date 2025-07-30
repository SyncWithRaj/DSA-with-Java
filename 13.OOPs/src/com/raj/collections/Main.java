package com.raj.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        // ArrayList is a non-synchronized, growable array that stores elements in order and is used in single-threaded environments.
        // It grows by increasing 50% of its size and provides better performance due to no locking.

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(45);
        list2.add(5);
        list2.add(15);
        list2.add(56);

        System.out.println(list2);


        // Vector is a synchronized, growable array that stores elements in order and is safe to use in multithreaded environments.
        // It grows by doubling its size when full and ensures thread safety by locking methods.
        List<Integer> vector = new Vector<>();

        vector.add(45);
        vector.add(5);
        vector.add(15);
        vector.add(56);

        System.out.println(vector);
    }
}
