package com.raj;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {99, 98, 43, 32, 23, 12, 3, 0, -3, -123, -234};
        int target = 23;

        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc;
        isAsc = arr[start] < arr[end];
        // upper and ower if-else both meaning is same
//        if (arr[start] < arr[end]) {
//            isAsc = true;
//        } else {
//            isAsc = false;
//        }


        while (start <= end) {
            //find the middle elements
//        int mid = (start + end)/ 2; // might be possible that (start + end) exceeds the range of int in java

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}


