package net.epam.study.task4;

import java.util.Scanner;

public class RunnerTask4 {
    public static void runnerTask4() {
        System.out.println("Task 4.");
        Scanner scannerForVariables = new Scanner(System.in);
        System.out.println("Input variable 1: ");
        int firstVariable = scannerForVariables.nextInt();
        System.out.println("Input variable 2: ");
        int secondVariable = scannerForVariables.nextInt();
        System.out.println("Input variable 3: ");
        int thirdVariable = scannerForVariables.nextInt();
        System.out.println("Input variable 4: ");
        int forthVariable = scannerForVariables.nextInt();
        boolean resultEvenNumberTask = Task4.isTwoNumbersEven(firstVariable, secondVariable, thirdVariable, forthVariable);
        System.out.println("Is 2 numbers even: " + resultEvenNumberTask);
    }
}
