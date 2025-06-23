package com.raj;

public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {12, 345, 22, 6, 7890};
        System.out.println("The number of number that contains even digits is " + findNumbers(nums));

        System.out.println(digits(0121221));
    }

    // to get all the number in array
    static int findNumbers(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // to check the number of digit are even or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    // to get the number of digits
    static int digits2(int num){
        if (num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    static int digits(int num) {

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
