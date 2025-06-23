package com.raj;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 4, 3, 2, 1};
        System.out.println(peakIndexInMountainArray(arr));
        System.out.println(search(arr, 4));
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; //because we know that mid + 1 element > mid element
            }
        }

        //in the end, start == end and pointing to the largest number bcz of the 2 checks above
        //start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        //more elaboration: at every poin tof time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining,  hence cuz of above line is the best possible ans
        return start; // or return end as both are equal
    }


    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

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


