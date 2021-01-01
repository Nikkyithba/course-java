package com.nikky.javabasics;

import java.util.Scanner;

public class GrossPay {


    public static void main (String[] args){

        Scanner input = new Scanner (System.in );
        System.out.print("Enter hourly rate:  ");
        int hourlyRate = input.nextInt();

        System.out.print("Enter total number of hours per week:   ");
        double totalHours= input.nextDouble();

        double grossPayment = hourlyRate * totalHours;
        System.out.println("Your gross payment for week is : " + grossPayment );

    }

}