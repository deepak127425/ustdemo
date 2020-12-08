package com.mortgage;

public class Main {

    final static byte month_in_year =12;
    final static byte percentage = 100;
    public static void main (String args[]) {

        int principal = (int) cal_console.readNumber("Principal: ",1000,1000000);
        float annual = (float) cal_console.readNumber("Annaul rate: ",1,30);
        byte period = (byte) cal_console.readNumber("years: ",1,30);

        cal_print.printMortgage (principal, annual, period);
        cal_print.printPaymentSchedule(principal,  annual, period);
    }

}
