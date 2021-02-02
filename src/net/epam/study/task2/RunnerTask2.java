package net.study.epam.task2;

import java.util.Scanner;

public class RunnerTask2 {
    public static void runnerTask2() {
        System.out.println("Task 2.");
        Scanner scannerForCalendar = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scannerForCalendar.nextInt();
        System.out.println("Enter month: ");
        int month = scannerForCalendar.nextInt();
        int resultDaysOfMonth = Task2.daysInMonth(year, month);
        System.out.println("Year: " + year + " Month: " + month + " Amount of days: " + resultDaysOfMonth);
        boolean resultIsYearLip = Task2.isYearLip(year);
        System.out.println("Is year lip: " + resultIsYearLip);
    }
}
