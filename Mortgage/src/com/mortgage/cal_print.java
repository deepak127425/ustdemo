package com.mortgage;

import java.text.NumberFormat;

public class cal_print {
    public static void printMortgage(int principal, float annual, byte period){
        double mortgage = cal_bal_cal.calculateMortgage ( principal,  annual,  period);
        String format = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("MORTGAGE");
        System.out.println(format);
    }

    public static void printPaymentSchedule(int principal, float annual, byte period){
        System.out.println("PaymentSchedule");
        for (short mon = 1; mon <= period * Main.month_in_year; mon++) {
            double printmonthy = cal_bal_cal.calculateBalance(principal, annual, period, mon);
            System.out.println(NumberFormat.getCurrencyInstance().format(printmonthy));
        }
    }
}
