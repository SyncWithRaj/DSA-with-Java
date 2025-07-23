package com.raj.staticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(22, "Kunal", 10000, false);
        Human Rahul = new Human(22, "Rahul", 15000, true);
        Human Arpit = new Human(22, "Arpit", 15000, true);

        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

        Main funn = new Main();
        funn.fun2();
    }

    // this is not dependent on objects
    static void fun(){
//        greeting();  // you cant use this bcz it requires an instance
        // but the function you are using it in does not depend on instance

        // you cannot access non static stuff without referencing  their instance in a static context

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();
    }

    void greeting(){
//        fun();
        System.out.println("Hello World!");
    }
}
