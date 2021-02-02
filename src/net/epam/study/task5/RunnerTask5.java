package net.study.epam.task5;

import java.util.Scanner;

public class RunnerTask5 {
    public static void runnerTask5() {
        System.out.println("Task 5.");
        Scanner scannerForPerfectNumber = new Scanner(System.in);
        System.out.println("Enter number: ");
        int perfectNumber = scannerForPerfectNumber.nextInt();
        boolean resultPerfectNumber = Task5.isNumberPerfect(perfectNumber);
        System.out.println("Is number perfect: " + resultPerfectNumber);
    }
}
