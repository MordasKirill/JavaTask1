package net.epam.study.task6;

import java.util.Scanner;

public class RunnerTask6 {
    public static void runnerTask6() {
        System.out.println("Task 6.");
        Scanner scannerForSeconds = new Scanner(System.in);
        System.out.println("Enter amount of seconds.");
        int seconds = scannerForSeconds.nextInt();
        int hours = Task6.countHours(seconds);
        int minutes = Task6.countMinutes(seconds, hours);
        System.out.println(hours + " hours and " + minutes + "minutes " + "passed.");
    }
}
