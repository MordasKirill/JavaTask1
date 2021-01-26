package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        //Task 2;
        Scanner scannerForCalendar = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scannerForCalendar.nextInt();
        System.out.println("Enter month: ");
        int month = scannerForCalendar.nextInt();
        int resultDaysOfMonth = daysInMonth(year, month);
        System.out.println("Year: " + year + " Month: " + month + " Amount of days: " + resultDaysOfMonth);
        boolean resultIsYearLip = isYearLip(year);
        System.out.println("Is year lip: " + resultIsYearLip);
    }
    private static int daysInMonth(int year, int month) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    private static boolean isYearLip(int year) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        return calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }
}
