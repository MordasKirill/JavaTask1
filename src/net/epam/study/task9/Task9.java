package net.epam.study.task9;

public class Task9 {
    public static void main(String[] args) {

    }
    public static double calculateCircumference(int radius) {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public static double calculateSquare(int radius) {
        double square = Math.PI * Math.pow(radius, 2);
        return square;
    }
}
