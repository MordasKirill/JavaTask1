package net.study.epam.task7;

import java.util.Scanner;

public class RunnerTask7 {
    public static void runnerTask7() {
        System.out.println("Task 7.");
        Scanner scannerForPoints = new Scanner(System.in);
        System.out.println("Enter x1: ");
        int pointX1 = scannerForPoints.nextInt();
        System.out.println("Enter y1: ");
        int pointY1 = scannerForPoints.nextInt();
        System.out.println("Enter x2: ");
        int pointX2 = scannerForPoints.nextInt();
        System.out.println("Enter y2: ");
        int pointY2 = scannerForPoints.nextInt();
        String closestPoint = Task7.calculateClosestPoint(pointX1, pointY1, pointX2, pointY2);
        System.out.println(closestPoint);
    }
}
