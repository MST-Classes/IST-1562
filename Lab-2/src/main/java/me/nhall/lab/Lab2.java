package me.nhall.lab;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Lab2 {

    public static void main(String[] args) {
        int[] input1 = {10, 2, 5, -2, 8, 1, 9};
        results(input1);

        int[] input2 = {-33, 78, 0, -2, 8, 1, -45};
        results(input2);
    }

    public static void sort(int @NotNull [] list) {
        for (int i = 0; i < list.length; i++) {
            for (int x = 0; x < list.length - 1; x++)
                if (list[x] > (list[x + 1])) {
                    int temp = list[x];
                    list[x] = list[x + 1];
                    list[x + 1] = temp;
                }
        }
    }

    public static void results(int[] list) {
        sort(list);
        System.out.println(Arrays.toString(list));
    }
}
