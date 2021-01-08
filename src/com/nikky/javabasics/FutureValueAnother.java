package com.nikky.javabasics;

import java.util.Scanner;

public class FutureValueAnother {
    public static void main (String[] args) {

        String choice;

        do {
        Scanner input = new Scanner(System.in);
        System.out.println("\n" +"\n" +" Enter Monthly Investmenet amount");
        double monthlyInvestmentAmount = input.nextDouble();

        System.out.println("Enter the yearly interest rate");
        double yearlyInterestRate = input.nextDouble();

        System.out.println("Enter number of years");
        int years = input.nextInt();


        double monthlyInterestRate = yearlyInterestRate / 12 / 100;
        System.out.println("monthlyInterestRate:       " + monthlyInterestRate);

        double finalValue = 0;
        int months = years * 12;

        int i = 0;
        while (i < months) {
            finalValue = finalValue + monthlyInvestmentAmount;
            double monthlyInterestAmount = finalValue * monthlyInterestRate;
            finalValue = finalValue + monthlyInterestAmount;
            i++;
        }

        System.out.println("Future Value Amount :    $" + finalValue);


        System.out.println("Do you want to continue with different values Y/N : ");
        choice = input.next();
    } while ( choice.equalsIgnoreCase("Y"));


        }
}

