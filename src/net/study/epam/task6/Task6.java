package net.study.epam.task6;

public class Task6 {
    public static void main(String[] args) {

    }
    public static int countHours(int seconds) {
        return seconds / 3600;
    }

    public static int countMinutes(int seconds, int hours) {
        return (seconds - hours * 3600) / 60;
    }
}
