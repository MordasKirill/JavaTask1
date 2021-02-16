package net.epam.study.task8;

public class Task8 {
    public static void main(String[] args) {

    }
    public static double calculateFunction(int variable) {
        if (variable >= 3) {
            return (Math.pow(variable, 2)) + (3 * variable) + 9;
        } else return 1 / (Math.pow(variable, 3) - 6);
    }
}
