package me.nhall.hw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        int counter = 0;
        int position = 0;

        Queue<String> peopleInQueue = new LinkedList<String>();

        name = sc.nextLine();
        while (!name.equals("-1")) {
            peopleInQueue.add(name);
            counter++;
            if (name.equalsIgnoreCase("You")) {
                position = counter;
            }
            name = sc.nextLine();
        }

        System.out.println("Welcome to the ticketing service... ");
        System.out.println("You are number " + position + " in the queue.");

        for (int i = position - 1; i >= 1; i--) {
            System.out.println(peopleInQueue.remove() + " has purchased a ticket.");
            System.out.println("You are now number " + i);
        }
        System.out.println("You can now purchase your ticket!");

    }
}
