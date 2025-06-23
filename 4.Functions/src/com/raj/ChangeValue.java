package com.raj;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //Create an array

        int[] arr = {1, 2, 3, 4, 5};
        change(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void change(int[] nums){
        nums[0] = 90;  //if you make the change to the object via this ref variable, same object will be change.
    }
}
