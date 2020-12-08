package com.mortgage;

import java.util.Scanner;

public class cal_console {
    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while(true){
            System.out.println(prompt);
            value = scanner.nextFloat();
            if(value >= min && value <=max)
                break;
            System.out.println("----");
        }
        return value;

    }
}
