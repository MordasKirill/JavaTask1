package com.company;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        //Task 5;
        Scanner scannerForPerfectNumber = new Scanner(System.in);
        System.out.println("Enter number: ");
        int perfectNumber = scannerForPerfectNumber.nextInt();
        boolean resultPerfectNumber = isNumberPerfect(perfectNumber);
        System.out.println("Is number perfect: " + resultPerfectNumber);
    }
    private static boolean isNumberPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
