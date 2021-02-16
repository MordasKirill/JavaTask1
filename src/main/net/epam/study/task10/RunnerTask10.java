package net.study.epam.task10;

import java.util.Scanner;

public class RunnerTask10 {
    public static void runnerTask10() {
        System.out.println("Task 10.");
        Scanner scannerForStep = new Scanner(System.in);
        System.out.print("Input segment start: ");
        int segmentStart = scannerForStep.nextInt();
        System.out.print("Input segment end: ");
        int segmentEnd = scannerForStep.nextInt();
        System.out.print("Input step h: ");
        int step = scannerForStep.nextInt();
        Task10.printCalculateFunctionWithStep(segmentStart, segmentEnd, step, "f(x) = tg(x)");
    }
}
