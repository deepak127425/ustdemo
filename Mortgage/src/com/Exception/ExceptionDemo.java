package com.Exception;

public class ExceptionDemo {
    public static void show(){
        try {
            hello("deepak");
        }
        catch (NullPointerException ex){
            System.out.println("name should not null");
        }
    }
    public static void hello(String name){
        System.out.println(name.toUpperCase());
    }
    public static void main (String args[]){
        show();
    }
}
