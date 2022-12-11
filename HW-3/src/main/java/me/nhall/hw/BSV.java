package me.nhall.hw;

public class BSV {

    public static void main(String[] args) {
        int[] arr = {75, 60, 45, 30, 25, 25, 20, 15, 10, 10, 5, 1};
        System.out.println(binarySearch(arr, 60));
        System.out.println(binarySearch(arr, 25));
        System.out.println(binarySearch(arr, 10));
        System.out.println(binarySearch(arr, 5));
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;

            if (arr[mid] == target) {
                while (mid != arr.length - 1) {
                    if (arr[mid + 1] != target)
                        break;
                    mid++;
                }
                return mid;
            } else if (arr[mid] < target) {
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return -1;
    }
}
