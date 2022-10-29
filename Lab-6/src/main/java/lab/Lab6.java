package lab;


import java.util.Arrays;
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Descending ordered array: ");
        String input = sc.nextLine();

        System.out.print("Target Number:");
        int target = sc.nextInt();

        String split[] = input.split(" ");
        int num[] = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            num[i] = Integer.parseInt(split[i]);
        }
        System.out.println(Arrays.toString(num));

        int result = search(num, target, 0, (num.length - 1));

        if (result == -1) {
            System.out.println("Found " + target);
        } else {
            System.out.println("Unable to find " + target);
        }

    }

    public static int search(int[] arr, int target, int low, int high) {
        if (low >= high) return -1;

        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return search(arr, target, low, mid - 1);
        } else {
            return search(arr, target, mid + 1, high);
        }
    }
}
