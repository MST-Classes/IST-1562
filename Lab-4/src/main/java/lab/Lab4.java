package lab;

import java.io.IOException;
import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int input = sc.nextInt();

        while (input < 0) {
            System.out.print("Please input a positive int: ");
            input = sc.nextInt();
        }

        int output = digitCount(input);
        System.out.println("Input: " + input + " | Output: " + output);
    }

    public static int digitCount(int x) {
        if (x < 10) {
            return 1;
        } else {
            return digitCount(x / 10) + 1;
        }
    }
}
