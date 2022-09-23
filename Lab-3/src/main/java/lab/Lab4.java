package lab;

import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Value of a: ");
        int a = sc.nextInt();
        System.out.println("Value of b: ");
        int b = sc.nextInt();

        int result = recursivePower(a,b);
        double checkedResult = Math.pow(a,b);
        System.out.println("Output of " + a + "^" + b + " is " + result);
        System.out.println("The answer from Math.pow() is " + checkedResult);

    }

    private static int recursivePower(int a, int b) {
        if (b == 0) return 1;
        return (a * recursivePower(a, b - 1));
    }
}
