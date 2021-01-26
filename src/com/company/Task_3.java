package com.company;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        //Task 3;
        Scanner scannerForSquare = new Scanner(System.in);
        System.out.println("Enter square area");
        int area = scannerForSquare.nextInt();
        double resultCalculateArea = calculateArea(area);
        System.out.println("Area of inscribed square is: " + resultCalculateArea);
        double resultHowManyTimesLessArea = howManyTimesLessArea(area, resultCalculateArea);
        System.out.println("How many times describedSquareArea greater then inscribedSquareArea: " + resultHowManyTimesLessArea + " times.");
    }
    private static double calculateArea(double area) {
        double side = Math.sqrt(area);
        double radius = side / 2;
        return (2 * Math.pow(radius, 2));
    }

    private static double howManyTimesLessArea(double describedSquareArea, double inscribedSquareArea) {
        return Math.round(describedSquareArea / inscribedSquareArea);
    }
}
