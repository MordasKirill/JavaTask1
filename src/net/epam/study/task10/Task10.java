package net.epam.study.task10;

public class Task10 {
    public static void main(String[] args) {

    }
    public static void printCalculateFunctionWithStep(int segmentStart, int segmentEnd, int step, String function){
        System.out.printf("%9s %10s %10s\n", "FORMULA", "X", "F(X)");
        for (int variable = segmentStart; variable <= segmentEnd; variable += step) {
            System.out.printf("%s %7d  %11.4f\n", function, variable, calculateFunctionWithStep(variable));
        }
    }
    public static double calculateFunctionWithStep(int variable) {
        return Math.tan(variable);
    }
}

