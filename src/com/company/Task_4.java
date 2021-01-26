package com.company;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        //Task 4;
        Scanner scannerForVariables = new Scanner(System.in);
        System.out.println("Input variable 1: ");
        int firstVariable = scannerForVariables.nextInt();
        System.out.println("Input variable 2: ");
        int secondVariable = scannerForVariables.nextInt();
        System.out.println("Input variable 3: ");
        int thirdVariable = scannerForVariables.nextInt();
        System.out.println("Input variable 4: ");
        int forthVariable = scannerForVariables.nextInt();
        boolean resultEvenNumberTask = isTwoNumbersEven(firstVariable, secondVariable, thirdVariable, forthVariable);
        System.out.println("Is 2 numbers even: " + resultEvenNumberTask);
    }
    private static boolean isTwoNumbersEven(int firstVariable, int secondVariable, int thirdVariable, int forthVariable) {
        int counter = 0;
        if (firstVariable % 2 == 0) {
            counter++;
        }
        if (secondVariable % 2 == 0) {
            counter++;
        }
        if (thirdVariable % 2 == 0) {
            counter++;
        }

        if (forthVariable % 2 == 0) {
            counter++;
        }
        return counter >= 2;
    }
}
