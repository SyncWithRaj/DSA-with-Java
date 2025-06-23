package com.raj;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
//            int a = 70; //already initialized te outside the box you can only change its value.
            a = 100; //reassign the origin ref variable to some other value
            int c = 34;

            //Value initialized in this block will remain in block
        }
        System.out.println(a);

//        System.out.println(c); //cannot use outside the block
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}

//Scope yaad karlena k block k andar initialize kia hua bahar nhi use kar sakte but bahar vala andar kar sakte hai initialize.
