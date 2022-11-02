package me.nhall.hw;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the base for the triangle: ");
        System.out.println("");
        int base = sc.nextInt();
        drawTriangle(base);
    }

    public static void drawTriangle(int baseLength) {
        if (baseLength <= 0) return;
        int spaces = (19 - baseLength) / 2;
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < baseLength; i++) {
            System.out.print("*");
        }
        System.out.println();
        drawTriangle(baseLength - 2);
    }
}
