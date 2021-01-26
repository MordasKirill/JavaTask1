package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        //Task 1;
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please, input any number: ");
        int inputNumber = inputScanner.nextInt();
        int resultCalculateLastDigit = calculateLastDigit(inputNumber);
        System.out.println("Result is: " + resultCalculateLastDigit);
    }
    private static int calculateLastDigit(int inputNumber) {
        int lastDigit = inputNumber % 10;
        int result = 0;
        switch (lastDigit) {
            case 1:
            case 9:
                result = 1;
                break;
            case 2:
            case 8:
                result = 4;
                break;
            case 3:
            case 7:
                result = 9;
                break;
            case 4:
            case 6:
                result = 6;
                break;
            case 5:
                result = 5;
                break;
            case 0:
                result = 0;
                break;
        }
        return result;
    }
}
