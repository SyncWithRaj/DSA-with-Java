package com.raj.singleton;

import com.raj.access.A;

import java.util.ArrayList;
import java.util.Collections;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(45, "Kunal Keshwaha");
//        int n = obj.num;
    }
}

class SubSubClass extends SubClass {

    public SubSubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(45, "Kunal Kushwaha");
        int n = obj.num;
    }
}

class SubClass2 extends A {
    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(45, "Kunal Keshwaha");
//        int n = obj.num;
    }
}
