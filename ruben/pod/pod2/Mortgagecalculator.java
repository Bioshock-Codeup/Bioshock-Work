package pod2;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgagecalculator {

    public static void main(String [] args){
        final byte Months_In_Year = 12;
        final byte Percent = 100;
        int principle = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;


        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Principal $1 - $1M: ");
            principle = scanner.nextInt();
            if (principle >= 1000 && principle <= 1_000_000)
                break;
            System.out.println("Enter a valid number");
        }
        System.out.println("thank you");



        while(true) {
            System.out.println("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30){
                monthlyInterest = annualInterest / Percent / Months_In_Year;
                break;
            }
            System.out.println("enter a value between 1 and 30");
        }

        while(true) {
            System.out.println("Period(years): ");
            byte years = scanner.nextByte();
            if (years >=1 && years <= 30) {
                numberOfPayments = years * Months_In_Year;
                break;
            }
        }
        double mortgage = principle
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                /(Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

        String morgtgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + morgtgageFormatted);
    }
}
