package com.raj.staticExample;

public class Human{
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("Hell World!");
//        System.out.println(this.age);  // cant use this over here
    }

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;  //here you can use this. also but when it is static class name is prefer to use
    }
}