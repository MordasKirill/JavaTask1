package com.company;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        //Task 6;
        Scanner scannerForSeconds = new Scanner(System.in);
        System.out.println("Enter amount of seconds.");
        int seconds = scannerForSeconds.nextInt();
        int hours = countHours(seconds);
        int minutes = countMinutes(seconds, hours);
        System.out.println(hours + " hours and " + minutes + "minutes " + "passed.");
    }
    private static int countHours(int seconds) {
        return seconds / 3600;
    }

    private static int countMinutes(int seconds, int hours) {
        return (seconds - hours * 3600) / 60;
    }
}
