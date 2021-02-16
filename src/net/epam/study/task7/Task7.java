package net.epam.study.task7;

public class Task7 {
    public static void main(String[] args) {

    }
    public static String calculateClosestPoint(int x1, int y1, int x2, int y2) {
        double firstDistance = Math.sqrt((x1 * x1) + (y1 * y1));
        double secondDistance = Math.sqrt((x2 * x2) + (y2 * y2));
        if (firstDistance < secondDistance) {
            return "First point is closer";
        } else return "Second point is closer";
    }
}
