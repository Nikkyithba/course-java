package com.nikky.javabasics;

import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter monthly investment amount:  ");
        double monthlyInvestmentAmount = input.nextDouble();

        System.out.print("Enter Yearly interst rate:    ");
        double yearlyInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double monthlyInterestRate = yearlyInterestRate / 12 / 100;
        System.out.println("monthlyInterestRate:       " + monthlyInterestRate);

        double futureValue = 0;
        int months = years * 12 ;
        for (int i = 0; i < months; i++) {

            futureValue = futureValue + monthlyInvestmentAmount;
            double monthlyInterestAmount = futureValue * monthlyInterestRate;
             futureValue  = futureValue + monthlyInterestAmount;

        }

        System.out.println("Future Value Amount :    $" + futureValue);
    }
}
