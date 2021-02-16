package net.study.epam.task3;

import java.util.Scanner;

public class RunnerTask3 {
    public static void runnerTask3() {
        System.out.println("Task 3.");
        Scanner scannerForSquare = new Scanner(System.in);
        System.out.println("Enter square area");
        int area = scannerForSquare.nextInt();
        double resultCalculateArea = Task3.calculateArea(area);
        System.out.println("Area of inscribed square is: " + resultCalculateArea);
        double resultHowManyTimesLessArea = Task3.howManyTimesLessArea(area, resultCalculateArea);
        System.out.println("How many times describedSquareArea greater then inscribedSquareArea: " + resultHowManyTimesLessArea + " times.");
    }
}
