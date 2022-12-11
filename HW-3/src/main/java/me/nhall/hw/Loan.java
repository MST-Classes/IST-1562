package me.nhall.hw;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();

        NumberFormat percentFormat = new DecimalFormat("#0.000");
        NumberFormat numberFormat = new DecimalFormat("#0.00");
        System.out.println("Interest Rate    Monthly Payment    Total Payment");

        for (double i = 5.0; i <= 8; i += 0.125) {
            System.out.print(percentFormat.format(i) + "%");
            System.out.print("           ");
            double monthlyInterestRate = i / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1
                    - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            System.out.print(numberFormat.format(monthlyPayment));
            System.out.print("            ");
            double totalPayment = (monthlyPayment * 12) * numberOfYears;
            System.out.print(numberFormat.format(totalPayment) + "\n");
        }
    }
}
