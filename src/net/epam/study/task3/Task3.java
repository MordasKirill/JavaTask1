package net.epam.study.task3;

public class Task3 {
    public static void main(String[] args) {

    }
    public static double calculateArea(double area) {
        double side = Math.sqrt(area);
        double radius = side / 2;
        double result = (2 * Math.pow(radius, 2));
        return result;
    }

    public static double howManyTimesLessArea(double describedSquareArea, double inscribedSquareArea) {
        return Math.round(describedSquareArea / inscribedSquareArea);
    }
}
