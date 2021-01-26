package com.company;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        //Task 8;
        Scanner scannerForX = new Scanner(System.in);
        System.out.println("Enter x: ");
        int variable = scannerForX.nextInt();
        double resultCalculateFunction = calculateFunction(variable);
        System.out.println("Result is: " + resultCalculateFunction);
    }
    private static double calculateFunction(int variable) {
        if (variable >= 3) {
            return (Math.pow(variable, 2)) + (3 * variable) + 9;
        } else return 1 / (Math.pow(variable, 3) - 6);
    }
}
