package com.raj;

public class OverLoading {
    public static void main(String[] args) {
//        fun(23);  //When i call function by integer then it will call " static void fun(int a)"
//        fun("Raj", 57);  //When i call function by string thrn it will call "static void fun(String name)"

        int ans = sum(23, 32);
        int ans2 = sum(23, 32, 10);
        System.out.println(ans);
        System.out.println(ans2);
    }

    //Note: You can make function with same name but you have to make argumrnt type different. if you make argument type same then it throws an error, this is called as function OverLoading.


    static int sum(int a, int b)
    {
        return a + b;
    }

    static int sum(int a, int b, int c)
    {
        return a + b + c;
    }
    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name, int b) {
        System.out.println(name);
    }

}
