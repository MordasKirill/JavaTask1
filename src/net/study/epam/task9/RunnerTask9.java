package net.study.epam.task9;

import java.util.Scanner;

public class RunnerTask9 {
    public static void runnerTask9() {
        System.out.println("Task 9.");
        Scanner scannerForRadius = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius = scannerForRadius.nextInt();
        double resultCalculateCircumference = Task9.calculateCircumference(radius);
        double resultCalculateSquare = Task9.calculateSquare(radius);
        System.out.println("Circumference = " + resultCalculateCircumference + " Square = " + resultCalculateSquare);
    }
}
