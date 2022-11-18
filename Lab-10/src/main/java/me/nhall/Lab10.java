package me.nhall;

import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Word: ");
        String word = sc.next();

        String output = word + " %placeholder% a palindrome";
        boolean result = checkPalindrome(word.toLowerCase());

        if (result) {
            System.out.println(output.replaceAll("%placeholder%", "is"));
        } else {
            System.out.println(output.replaceAll("%placeholder%", "is not"));
        }
    }

    public static boolean checkPalindrome(String word) {
        int a = 0;
        int b = word.length() - 1;
        while (a < b) {
            if (word.charAt(a) != word.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}