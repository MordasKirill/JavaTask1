package net.study.epam.task8;

import java.util.Scanner;

public class RunnerTask8 {
    public static void runnerTask8() {
        System.out.println("Task 8.");
        Scanner scannerForX = new Scanner(System.in);
        System.out.println("Enter x: ");
        int variable = scannerForX.nextInt();
        double resultCalculateFunction = Task8.calculateFunction(variable);
        System.out.println("Result is: " + resultCalculateFunction);
    }
}
