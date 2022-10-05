package me.nhall.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Weights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> weights = new ArrayList<Double>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Weight " + (i + 1));
            weights.add(sc.nextDouble());
        }

        System.out.print("You entered: ");
        for (double weight : weights) {
            System.out.print(weight + " ");
        }
        System.out.println();
        System.out.println("Total Weight: " + sum(weights));
        System.out.println("Average: " + (sum(weights) / weights.size()));
        System.out.println("Total Weight: " + Collections.max(weights));

    }

    public static double sum(List<Double> values) {
        double result = 0;
        for (double value : values)
            result += value;
        return result;
    }
}
