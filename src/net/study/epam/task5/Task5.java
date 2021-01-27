package net.study.epam.task5;

public class Task5 {
    public static void main(String[] args) {

    }
    public static boolean isNumberPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
