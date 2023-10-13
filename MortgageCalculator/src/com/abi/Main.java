package com.abi;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        System.out.print("Principal: ");
        Scanner scanner = new Scanner(System.in);
        long principal = scanner.nextLong();

        System.out.print("Annual Interest Rate: ");
        double annualRate = scanner.nextDouble();
        double monthlyRate = annualRate/MONTHS_IN_YEAR/PERCENT;

        System.out.print("Period (Years): ");
        int period = scanner.nextInt();
        int numberOfPayments = period*MONTHS_IN_YEAR;

        double expr = Math.pow(1+monthlyRate,numberOfPayments);
        double mortgage = principal*((monthlyRate*expr)/(expr-1));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgageCurrency = currency.format(mortgage);
        System.out.println("Mortgage: " + mortgageCurrency);
    }
}
