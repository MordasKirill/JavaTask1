package net.study.epam.task1;

import java.util.Scanner;

public class RunnerTask1 {
    public static void runnerTask1(){
        System.out.println("Task 1.");
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please, input any number: ");
        int inputNumber = inputScanner.nextInt();
        int resultCalculateLastDigit = Task1.calculateLastDigit(inputNumber);
        System.out.println("Result is: " + resultCalculateLastDigit);
    }
}
