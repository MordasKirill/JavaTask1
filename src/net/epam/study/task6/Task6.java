package net.study.epam.task6;

public class Task6 {
    public static void main(String[] args) {

    }
    public static int countHours(int seconds) {
        int hours = seconds / 3600;
        return hours;
    }

    public static int countMinutes(int seconds, int hours) {
        int minutes = (seconds - hours * 3600) / 60;
        return minutes;
    }
}
