package com.practise;

public class App {
    public static void main(String[] args) {

        int number = 5;
        int factorialNumber = factorial(number);
        System.out.println(factorialNumber);

    } // end of main

    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return factorial(number - 1) * number;
    }
}
