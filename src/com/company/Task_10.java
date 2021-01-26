package com.company;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        //Task 10;
        Scanner scannerForStep = new Scanner(System.in);
        System.out.print("Input segment start: ");
        int segmentStart = scannerForStep.nextInt();
        System.out.print("Input segment end: ");
        int segmentEnd = scannerForStep.nextInt();
        System.out.print("Input step h: ");
        int step = scannerForStep.nextInt();
        printCalculateFunctionWithStep(segmentStart, segmentEnd, step, "f(x) = tg(x)");
    }
    private static void printCalculateFunctionWithStep(int segmentStart, int segmentEnd, int step, String function){
        System.out.printf("%9s %10s %10s\n", "FORMULA", "X", "F(X)");
        for (int variable = segmentStart; variable <= segmentEnd; variable += step) {
            System.out.printf("%s %7d  %11.4f\n", function, variable, calculateFunctionWithStep(variable));
        }
    }
    private static double calculateFunctionWithStep(int variable) {
        return Math.tan(variable);
    }
}

