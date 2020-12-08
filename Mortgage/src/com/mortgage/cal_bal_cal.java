package com.mortgage;

public class cal_bal_cal {
    public static double calculateBalance(int principal, float annual, byte period, short mon){
        float month = annual / Main.percentage / Main.month_in_year;
        float per = period * Main.month_in_year;

        double balance = principal
                * (Math.pow(1 + month, per) - Math.pow(1 + month, mon))
                / (Math.pow(1 + month, per) - 1);
        return balance;
    }

    public static double calculateMortgage (int principal, float annual, byte period){
        float month = annual /  Main.percentage / Main.month_in_year;
        float noofpayment = period * Main.month_in_year;
        double calculator = principal *
                (month * Math.pow(1 + month, noofpayment))
                / (Math.pow(1 + month, noofpayment) - 1);
        return calculator;
    }
}
