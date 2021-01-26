package com.company;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        //Task 9;
        Scanner scannerForRadius = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius = scannerForRadius.nextInt();
        double resultCalculateCircumference = calculateCircumference(radius);
        double resultCalculateSquare = calculateSquare(radius);
        System.out.println("Circumference = " + resultCalculateCircumference + " Square = " + resultCalculateSquare);
    }
    private static double calculateCircumference(int radius) {
        return 2 * Math.PI * radius;
    }

    private static double calculateSquare(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
