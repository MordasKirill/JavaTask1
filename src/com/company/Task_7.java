package com.company;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        //Task 7;
        Scanner scannerForPoints = new Scanner(System.in);
        System.out.println("Enter x1: ");
        int pointX1 = scannerForPoints.nextInt();
        System.out.println("Enter y1: ");
        int pointY1 = scannerForPoints.nextInt();
        System.out.println("Enter x2: ");
        int pointX2 = scannerForPoints.nextInt();
        System.out.println("Enter y2: ");
        int pointY2 = scannerForPoints.nextInt();
        String closestPoint = calculateClosestPoint(pointX1, pointY1, pointX2, pointY2);
        System.out.println(closestPoint);
    }
    private static String calculateClosestPoint(int x1, int y1, int x2, int y2) {
        double firstDistance = Math.sqrt((x1 * x1) + (y1 * y1));
        double secondDistance = Math.sqrt((x2 * x2) + (y2 * y2));
        if (firstDistance < secondDistance) {
            return "First point is closer";
        } else return "Second point is closer";
    }
}
